package p06.lecture.p4method;

public class A01method {
	public static void main(String[] args) {
		// (instance)method: 인스턴스의 기능(코드 불럭)
		MyClass1 c1 = new MyClass1();

		c1.method1("aa", 33);
		//c1.method2(param1, param2);
		int a = c1.method2();
		System.out.println(a);

		MyClass1 c2 = new MyClass1();

		c2.method1("bb", 44);
		int b = c2.method2();
		System.out.println(b);
	}
}
