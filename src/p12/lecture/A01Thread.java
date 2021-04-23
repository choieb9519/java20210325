package p12.lecture;

public class A01Thread {
	//Thread: 프로그램(프로세스) 내에서 실행되는 흐름의 단위
	//프로그램을 프로세스라고 하기도 함
	//어떤 문제가 발생하는지만 알면 됨
	//해결방법까지는 어려움
	
	//Thread 만드는 법: 
	//1. Thread 클래스 상속
	//2. Runnable 인터페이스 구현

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();  //실제 실행은 start부터
		
		System.out.println("메인 메소드 실행");
	}
}  //메인 메소드와 run메소드가 동시에 실행됨


class Thread1 extends Thread {  //인스턴스 메소드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread1 실행");
	} //run재정의
}