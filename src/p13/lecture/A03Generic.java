package p13.lecture;

public class A03Generic {
	public static void main(String[] args) {
		Generic3<String> g3 = new Generic3<>();
		g3.setO("java");
		String s = g3.getO();
		System.out.println(s); //안전하게 사용 가능
		
		Generic3<Integer> g4 = new Generic3<>();
//		g4.setO("java");  x
		g4.setO(999);
		int i = g4.getO();  //auto unboxing
		System.out.println(i);
		
		Generic3<Double> g5 = new Generic3<>();
//		g5.setO(333);  x
		g5.setO(3.14);
		double d = g5.getO();
		System.out.println(d);
	}
}


class Generic3<T> {
	//타입파라미터 사용
	private T o;
	
	public T getO() {
		return o;
	}
	
	public void setO(T o) {
		this.o = o;
	}
}