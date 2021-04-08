package p06.lecture.p5static;

public class MyClass2 {
	
	//클래스 필드 = 스테틱 필드(클래스멤버/스테틱멤버)
	static int i;
	
	//인스턴스 필드(인스턴스멤버)
	int j;
	
	//클래스 메소드 = 스테틱 메소드(클래스멤버/스테틱멤버)
	static void method() {
		System.out.println("merhod()");
	}
	
	//인스턴스 메소드(인스턴스멤버)
	void method1() {
		System.out.println("merhod1()");
	}
}
