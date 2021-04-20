package p10.lecture;

public class A15Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("프로그램 실행");
		method1();
		System.out.println("프로그램 종료");
	} //메소드에서 다른 메소드를 호출할 수 있음

	public static void method1() throws ClassNotFoundException {
		method2();
	}

	public static void method2() throws ClassNotFoundException {
		method3();
	}

	public static void method3() throws ClassNotFoundException {
			Class.forName("java.lang.Number2");
	} 
}
