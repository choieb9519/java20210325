package p05.lecture;

public class A19ArrayInitValue {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[] {55, 66, 77};
		int[] arr3 = {3, 4, 5, 6, 7};
		//자주 사용하므로 생략 가능
		//but 선언 이후 사용 할 수 없음(arr5)
		
		int[] arr4;
		arr4 = new int[] {9, 8, 7}; //o
		
		int[] arr5;
		//arr5 = {34, 56, 78};  //x
	}
}
