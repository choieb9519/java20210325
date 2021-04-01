package p04.textbook;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i % 2 !=0) {
				continue;//loop의 나머지 코드를 실행하지 않고 계속 진행
			}
			System.out.println(i);
		}
	}
}
