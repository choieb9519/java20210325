package p06.lecture.p4method;

public class MyClass9 {
	//매소드명을 같게 하고 싶으면 타입이나 순서, 개수 다르게: 오버로딩
	void method() {
		System.out.println("method()~~");
	}
	
/*	위와 같은 코드
 	int method() {
		System.out.println("method()");
	}
*/	
	void method(int i) {
		System.out.println("method");
	}
	void method(double i) {
		System.out.println("method(double)");
	}//파라미터 값이 다르니까 다른 메소드
	//같은 타입이 먼저 실행됨
	//자동 형변환됨
	void method(int i, int j) {
		System.out.println("method(int, int)");
	}
	void method(int i, String s) {
		System.out.println("method(int, String)");
	}
	void method(String s, int i) {
		System.out.println("method(String, int)");
	}
}
