package p08.textbook.s080302;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			//클래스와 인스턴스를 한꺼번에 만듦
			
			public void turnOn() {
			}
			public void turnff() {
			}
			public void setVolume(int volume) {
			}
			
		}; //하나의 statement가 끝나면 세미콜론
		
		System.out.println(re.MAX_VOLUME);
		System.out.println(re.MIN_VOLUME);
		rc.setMute(false);
		RemoteControl.changeBattery();
		
		rc.turnOn();
		rc.turnff();
		rc.setVolume(3);
		
	}
}
