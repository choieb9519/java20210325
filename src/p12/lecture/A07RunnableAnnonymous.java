package p12.lecture;

public class A07RunnableAnnonymous {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread 실행");
			}
		});
		
		thread.start();
	}
}
