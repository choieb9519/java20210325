package p06.lecture.p4method;

public class MyClass1 {
	
	//field
	int age;
	String name;
	
	//constructor
	MyClass1(){
		
	}
	
	MyClass1(String name) {
		this.name = name;
	}
	
	/*method
	리턴타입 메소드명(파라미터 리스트){ 
	          실행될 명령문들
	}
	*/
	void method1(String param1, int param2) {
				//[타입 이름] [타입 이름]: 0개 이상
		System.out.println("method1 호출");
	}
	
	int method2() {
		System.out.println("method2 호출");
		return 3;
	} 
}
