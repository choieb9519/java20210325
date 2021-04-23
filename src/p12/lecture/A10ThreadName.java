package p12.lecture;

public class A10ThreadName {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread10());
		t1.setName("thread 999");
		t1.start();
		
		Thread t2 = new Thread(new Thread10(), "ad thread");
		t2.start();
	}
}

class Thread10 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		
		System.out.println(name);
	}
}