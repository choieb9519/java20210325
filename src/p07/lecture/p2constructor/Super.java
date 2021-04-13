package p07.lecture.p2constructor;

public class Super {
	//클래스는 별 일 없으면 private로
	private int i;
	
	//생성자
	public Super() {
		
	}
	
	public Super(int i) {
		this.i = i;
	}
	
	//공개는 get, set 메소드로
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	void method1() {
		System.out.println("method1");
	}
}
