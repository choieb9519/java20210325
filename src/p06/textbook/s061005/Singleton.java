package p06.textbook.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	//이 싱글톤필드는 내부에서만 사용 가능
	
	private Singleton() {}
	//생성자가 하나인데 private로 지정
	//생성자를 이용해 instance얻지 못함
	
	static Singleton getInstance() {
		return singleton;
	}//메소드는 static: singleton의 참조값을 return
}
