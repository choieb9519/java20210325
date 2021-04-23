package p12.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class A16AtomicVariable {
	// 책에는 없지만 알아두면 유용함

	static int sv;
	static AtomicInteger ai = new AtomicInteger();

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					sv++;
					ai.getAndIncrement();
				}
			}
		});

		t.start();

		for (int i = 0; i < 1_000_000; i++) {
			sv++;
			ai.getAndIncrement();
		}

		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(sv);
		System.out.println(ai.get());
	}
}
