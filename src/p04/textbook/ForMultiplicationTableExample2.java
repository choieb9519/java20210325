package p04.textbook;

public class ForMultiplicationTableExample2 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
		//1번         2번      3번
			for (int j = 0; j < (5-i); j++) {
				//4번        5번       6번
				System.out.print("*");
			}                    //7번
			System.out.println(); //8번
		//순서: 1-2-4-(5-7-6)*5-(5가 f면)8-3-2-4-(5-7-6)반복-...5-8-3-2-4
		}
		
		for (int i = 0; i < 5; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for(int k = 0; k < (4-i); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
