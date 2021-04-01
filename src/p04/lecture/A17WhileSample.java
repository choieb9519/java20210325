package p04.lecture;

import java.util.Scanner;

public class A17WhileSample {
	public static void main(String[] args) {
		int comNumber = (int) (Math.random() * 100) + 1;

		System.out.println("comNumber: " + comNumber);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("컴퓨터의 수를 맞춰보세요>");
			int userNumber = scanner.nextInt();

			if (userNumber == comNumber) {
				System.out.println("맞췄습니다");
				break;
				//정답을 맞추면 더 이상 진행하지 않아도 되기 때문에
			} else if (userNumber < comNumber) {
				System.out.println("더 큰 수를 입력해보세요");
			} else if(userNumber > comNumber) {
				System.out.println("더 작은 수를 입력해보세요");
			}


		}
		scanner.close(); //scanner가 밖에 있으니까 while문 밖에!
		
		System.out.println("프로그램 종료");
	}
}
