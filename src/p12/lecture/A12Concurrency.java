package p12.lecture;

public class A12Concurrency {
	//동시에 작업하기 때문에 생기는 문제
	
	static long shareValue = 0;
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i= 0; i < 100_0000; i++) {
					shareValue++;
				}
			}
		});
		t.start();
		for (int i = 0 ; i < 100_0000; i++) {
			shareValue++;
		}
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(shareValue);
		
	}
}
