package p12.lecture;

public class A02Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread2();
		t1.start();  //start메소드가 thread메소드를 시작시킴
		
		int end = 1_0000_0000;
		for (int i = 0; i < end; i++) {
			System.out.println("main thread 실행");
		}
	}
}   //메인 메소드와 run메소드가 동시에 실행됨

class Thread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int end = 1_0000_0000;
		for (int i = 0; i < end; i++) {
			System.out.println("thread2실행");
		}
	}
}
