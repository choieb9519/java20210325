package p07.lecture.p6polymorpism.ex2;

public class A04Array {
	public static void main(String[] args) {
		double[] arr1 = new double[5];
		arr1[0] = 3.14;
		arr1[1] = 2.99F; //float타입
		arr1[2] = 999999999999L; //long타입
		
		KindaCat[] arr2 = new KindaCat[5]; //기본값 null 들어있음
		arr2[0] = new KindaCat();
		arr2[1] = new Cat();
		arr2[2] = new Tiger();
		
	}
}
