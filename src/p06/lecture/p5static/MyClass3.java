package p06.lecture.p5static;

public class MyClass3 {
	int i;
	static int j;
	
	static void method1() {
		System.out.println("method1()");
		method3(); //this사용 불가
		//스테틱(클래스)멤버에서 인스턴스멤버 호출 불가
		System.out.println(j);
//		System.out.println(i);  x
	}
	//메소드에서 다른 메소드 호출 가능
	static void method3() {
		System.out.println("method3()");
	}
	void method2() {
		System.out.println("method()");
		this.method4(); //this키워드 사용 가능
		method3(); //인스턴스멤버에서 스테틱멤버 호출 가능
	}
	//this는 static앞에 못 씀
	//instance에서 사용 가능
	void method4() {
		System.out.println("method4()");
	}
}
