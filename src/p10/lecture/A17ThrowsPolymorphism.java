package p10.lecture;

import java.io.FileInputStream;

public class A17ThrowsPolymorphism {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	private static void method1() throws Exception {
		                          //두가지 예외모두 exception을 상속받았기 때문에
		Class.forName("java.lang.String");
		FileInputStream file = new FileInputStream("");
	}
}
