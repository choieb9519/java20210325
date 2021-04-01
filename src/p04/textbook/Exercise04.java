package p04.textbook;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;

		while (true) {
			if (dice1 == 1 && dice2 == 4) {
				System.out.println("(" + dice1 + ", " + dice2 + ")");
				break;
			} else if (dice1 == 4 && dice2 == 1) {
				System.out.println("(" + dice1 + ", " + dice2 + ")");
				break;
			} else if (dice1 == 2 && dice2 == 3){
				System.out.println("(" + dice1 + ", " + dice2 + ")");
				break;
			} else if (dice1 == 3 && dice2 == 2) {
				System.out.println("(" + dice1 + ", " + dice2 + ")");
				break;
			} else {
				continue;
			}
		}
	}
}
