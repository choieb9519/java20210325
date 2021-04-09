package p06.lecture.p8access_modifier;

import p06.lecture.p8access_modifier.package1.MyClass1;

public class A02AccessModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
//		System.out.println(o1.j);   private  x
		System.out.println(o1.i); //o
		//public과 private의 차이
//		System.out.println(k);      default  x
	}
}
