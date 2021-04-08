package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	//파라미터의 개수
	void method1(int i) {
		System.out.println("method1!!");
	}
	void method2(int i, int j) {
		System.out.println("method2^^");
	}
	void method3(int... i) {
		System.out.println("method3@@");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	} //인티저를 여러개 받을래 varargs
	  //i는 배열로 사용됨
	
	void method4(double d, int... i) {
		System.out.println("method**");
	} //다른 파라미터와 같이 쓰이면 항상 맨 뒤에 위치
}
