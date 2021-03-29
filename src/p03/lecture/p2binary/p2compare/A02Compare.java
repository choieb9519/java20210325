package p03.lecture.p2binary.p2compare;

public class A02Compare {
	public static void main(String[] args) {
		double d = 3.0;
		int i = 3;
		
		System.out.println(3.0 == 3);
		//int 3이 double로 변환돼서 연산 가능
		
		double e = 0.1; //8byte
		float f = 0.1F; //4byte
		
		System.out.println(e == f);
	}
}
