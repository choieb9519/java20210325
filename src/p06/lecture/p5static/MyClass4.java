package p06.lecture.p5static;

public class MyClass4 {
	int i = 3; //인스턴스 필드 초기화
	int j;
	
	static int a = 30;
	static int b;
	
	static {
		//복잡한 초기값은 스테틱블록 사용
		b = 50;
		System.out.println("static blok");
	}
	//이 클래스 정보가 jvm에 의해 읽힐 때(클래스가 로딩될 때)
	//스테틱블록이 실행됨
	//여러개 작성하면 작성된 순서대로 실행됨
	
	MyClass4() { 
		//인스턴스필드를 감싸는 블록o
		//인스턴스 필드 초기화
		this.j = 5;
	}
}
