package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A16Throws {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method1() throws ClassNotFoundException, FileNotFoundException {
		//throws는 여러 예외를 콤마로 나열할 수 있음
		Class.forName("java.lang.Number");
		FileInputStream fis = new FileInputStream("");
	}
}
