package p05.lecture;

public class A10Array {
	public static void main(String[] args) {
		int i;
		i = 5;
		
		int[] arr; //배열도 참조타입
		arr = new int[3];
		
		arr[0] = 5;
		arr[1] = 7;
		arr[2] = 1;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//한번에 출력
		System.out.println(Arrays.toString(arr));
	}
}
