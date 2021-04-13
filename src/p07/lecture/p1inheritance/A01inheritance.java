package p07.lecture.p1inheritance;

public class A01inheritance {
	/* 상속 : 상속 받는 클래스는 상속하는 클래스의 멤버를 갖는다.
	  상속 받는 클래스: 하위 클래스, 자식 클래스, sub class
	  상속 하는 클래스: 상위 클래스, 부모 클래스, super class
	  
	  문법: sub class에 extends 키워드로 super class명칭 적기
	 */
	
	public static void main(String[] args) {
			A01Child o1 = new A01Child();
//			A01Child o2 = new A01Child(3);  생성자는 상속x
			
			o1.i = 3;
			o1.method1();
	}
}
