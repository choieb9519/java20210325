package p04.textbook;

public class FoeMultiplicationTableExample1 {
	public static void main(String[] args) {
		//2단 ~ 9단 구구단
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
			System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		//2단 ~ 9단 짝수단만
		System.out.println();
		System.out.println("2단 ~ 9단 : 짝수단만");
		for (int m = 2; m <= 8; m += 2) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
			System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		//2단 ~ 9단 * 홀수만
		System.out.println();
		System.out.println("2단 ~ 9단 : 홀수만");
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n += 2) {
			System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		//2단 ~ 9단 * 짝수만
		System.out.println();
		System.out.println("2단 ~ 9단 : 짝수만");
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 2; n <= 9; n += 2) {
			System.out.println(m + " x " + n + " = " + (m * n));
					}
				}
		
		//9단 ~ 2단
		System.out.println();
		System.out.println("9단 ~ 2단 : 거꾸로");
		for (int m = 9; m >= 2; m--) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
			System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		//9단 ~ 2단 : 전체 거꾸로
		System.out.println();
		System.out.println("9단 ~ 2단 : 전체 거꾸로");
		for (int m = 9; m >= 2; m--) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 9; n >= 1; n--) {
			System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
	}
}
