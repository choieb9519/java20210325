package p06.textbook.s060802;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드1
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//메소드2
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;  //false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true;  //true를 리턴
	}
	
	//메소드3
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return; //메소드 실행 종료
			}
		}
	}
	
	
}
