package p12;

public class A13Join {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread13());
		t1.start();
		
		System.out.println("main 실행중");
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //이 thread가 종료된 후에 "main 종료"
		System.out.println("main 종료");
	}
}

class Thread13 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <Integer.MAX_VALUE; i++) {
			
		} 
		System.out.println("thread 일 종료");
	}
}
