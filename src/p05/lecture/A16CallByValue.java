package p05.lecture;

public class A16CallByValue {
	public static void main(String[] args) {

		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i * 2;
		}

		print(arr1);

		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 100;
		}

		print(arr2);
	}

	public static void print(int[] arr) {
		/*
		 * for (arr1 ; i < 5; i += 2) 
		 * { System.out.println(arr1); 
		 * } 
		 * for (arr2 ; i < 500;i ++) { 
		 * System.out.println(arr2); 
		 * } 내가 한 것 오류*/

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
