package p06.lecture.p7package;

import java.util.Scanner;

import p06.lecture.p7package.package2.MyClass2;
//                                    여러 클래스 사용하려면 *
public class A02Package {
	public static void main(String[] args) {
		//다른 패키지 사용하기
		p06.lecture.p7package.package1.MyClass1 o1
		= new p06.lecture.p7package.package1.MyClass1();
		
		//class 전에 import하면 간단한 코드로 사용 가능
		MyClass2 o2 = new MyClass2();
		
		//같은 패키지 사용하기
		MyClass3 o3 = new MyClass3();
		
		Scanner scanner = new Scanner(System.in);
		//ctrl shift o 하면 자동 import
	}
}
