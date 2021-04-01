package p04.textbook;

public class Exersice03 {
	public static void main(String[] args) {
		
		//1~100사이의 정수 중에서 3의 배수의 총 합
		int sum = 0; 
		for (int i = 1; i <=100; i++) {
			if ((i % 3) == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}