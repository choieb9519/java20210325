package p06.textbook.s060803;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //생성자를 안만들어서 파라미터 없는 기본 생성자 사용
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		//key turnon을 안 한 상태니까 초기값 0이 출력됨
		
		myCar.keyTurnOn();
		myCar.run();
		
		speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		
	}
}
