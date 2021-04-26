package p13.lecture;

public class A02Generic {
	//자바는 타입에 민감함
	//제네릭이 없던 시절엔 형변환을 해서 사용
	public static void main(String[] args) {
		Generic2 g2 = new Generic2();
		g2.setO("java");
		String s = (String) g2.getO(); //오류날 수 있는 코드
		System.out.println(s);
		
		g2.setO(22);
		//int->Integer auto boxing발생
		Integer i = (Integer)g2.getO(); //오류날 수 있음
		System.out.println(i);
		
		g2.setO(3.14);
		//double auto boxing발생
		Integer d = (Integer)g2.getO(); //오류날 수 있음
		System.out.println(d); //컴파일러에서 안알려줌
		
	}
}

class Generic2 {
	private Object o;
	//타입파라미터 사용안함
	//오브젝트는 모든 타입의 상위 타입
	
	public void setO(Object o) {
		this.o = o;
	}
	
	public Object getO() {
		return o;
	}
}