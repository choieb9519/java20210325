package p04.lecture;

public class A10FOrScope {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		
		int i; //선언을 밖에서 하면 출력 가능
		
		for (int i = 0; i <5; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i); 출력 불가
		System.out.println(i);
		
		
	}
}
