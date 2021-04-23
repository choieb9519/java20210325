package p12.lecture;

public class A15SynchronizedBlock {
	public static void main(String[] args) {
		
	}
}

class Thread15 extends Thread {
	public Memory memory;
	
	@Override
	public void run() {
		memory.execute();
	}
}

class Memory {
	public void execute() {
		System.out.println("statment1");
		
		synchronized (this) {
					//여기 정의된 객체를 획득한게 먼저 실행됨->사용 후 윈도우에 반납->반복
			System.out.println("statment2");
			System.out.println("statment3");
		}
		System.out.println("statment4");
	}
}