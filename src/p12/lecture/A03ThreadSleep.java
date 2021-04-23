package p12.lecture;

public class A03ThreadSleep {
	// thread의 실행을 잠시 멈춤

	public static void main(String[] args) {
		
		System.out.println("실행1");
		
		
		try {
			Thread.sleep(5000);  //long타입의 파라미터, 1초는 1000입력
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	System.out.println("실행2");
	}
}
