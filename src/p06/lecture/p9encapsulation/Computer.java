package p06.lecture.p9encapsulation;

public class Computer {
	String cpu;
	private int ram; //1보다 작으면 안된다면
	//필드를 공개하지 않으면 됨
	
	public void setRam(int ram) {
		if (ram < 1) {
			System.out.println("입력할 수 없습니다.");
		} else {
			this.ram = ram;
		}
	}
	//읽을 수 있는 메소드
	public int getRam() {
		return this.ram;
	}
}
