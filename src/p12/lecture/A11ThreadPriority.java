package p12.lecture;

public class A11ThreadPriority {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {  //0부터 10억까지 반복하는 thread가 10개 만들어짐
		
			Thread t = new Thread(new Thread11());
			if (i == 0) {
				t.setPriority(10); //1~10 사이의 값, 10이 가장 높은 우선순위
			} else {
				t.setPriority(1);  //0번 thread가 가장 높은 우선순위: 먼저 cpu를 점유함
			}
				t.start();
		} 
	}
}

class Thread11 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10_0000_0000L; i++) {
			
		}
		System.out.println(Thread.currentThread().getName());
	}
}
