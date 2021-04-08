package p06.lecture.p5static;

public class A02StaticMember {
	public static void main(String[] args) {
		MyClass2.i = 5;
		System.out.println(MyClass2.i);
		
		MyClass2.method();
		
//		MyClass2.j = 3;
//		MyClass2.method1();
//      인스턴스 없이는 못 씀
		
		MyClass2 o1 = new MyClass2();
		o1.j = 10;
		MyClass2 o2 = new MyClass2();
		o1.j = 20;
		System.out.println(o1.i);
		System.out.println(o2.i);
		//o1과 o2가 i를 공유함
		o1.i = 9;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(MyClass2.i);
	}
}
