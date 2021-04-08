package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a = 5;
		double b;
		b = a;
		//작은 타입은 큰 타입으로 자동 형변환
		a = (int) b;
		
		MyClass6 o1 = new MyClass6();
		o1.method1(a);
//		o1.method1(b); x
		
		o1.method2(b);
		o1.method2(a);
	}
}
