package p06.textbook.s061004;

//클래스
public class Car {
	
	//인스턴스필드
	int speed;
	
	//인스턴스메소드
	void run () {
		System.out.println(speed + "으로 달립니다.");
		
	}
	
	//(메인)스테틱(=클래식)메소드
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
