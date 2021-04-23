package p12.lecture;


public class A14SynchronizedMethod {
	public static void main(String[] args) {
		Thread14 t1 = new Thread14();
		Thread14 t2 = new Thread14();
		
		Box box = new Box();  //같은 box를 공유
		t1.box = box;		//동시에 실행될 수 있음
		t2.box = box;
		
		t1.start();
		t2.start();
	}
}

class Thread14 extends Thread {
	public Box box;
	
	public void run() {
		box.execute();
	}
}


class Box{
	public synchronized void execute() {  //이 메소드의 실행과 종료가 끝나야 다음 메소드로 넘어감
		System.out.println("method start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method end");
	}
}