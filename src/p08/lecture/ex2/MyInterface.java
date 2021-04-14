package p08.lecture.ex2;

public interface MyInterface {
	// public static final 필드만 만들 수 있음
	public static final int MY_FIELD1 = 1;
	int MY_FIELD2 = 2;
	String MY_FIELD3 = "hello";

	// public abstract 메소드(인스턴스 메소드)
	// 인터페이스 탄생의 목적: 제일 중요
	public abstract void method1();
	void method2();

	// public static 메소드(클래스 메소드)
	public static void staticMethod1() {
		System.out.println("static method1");
	}
	public static void staticMethod2() {
		System.out.println("static method2");
	}

	// public default 메소드(인스턴스 메소드)
	public default void defaltMethod1() {
		System.out.println("default method1");
	} //디폴 메소드는 몸통 있어야함
	default void defaltMethod2() {
		System.out.println("default method2");
	}
	
}// 생성자는 못 가짐: 인터페이스로 인스턴스를 만들 수 없기 때문에
