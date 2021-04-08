package p06.lecture.p4method;

import java.util.Arrays;

public class A05Parameter {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.method1(); //MyClass5의 메소드1 호출
		o1.method2(2345);
		o1.method2(5);
				//argument=인수=인자
		int x = 5;
		int y = 7;
		o1.method3(x, y);
		o1.method3(10, 20);
		
		int[] arr1 = {1, 2, 3};
		o1.method4(arr1);
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		
		o1.method4(new int[] {9, 8});
		
	}
}
