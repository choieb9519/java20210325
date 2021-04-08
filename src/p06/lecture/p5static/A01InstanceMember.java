package p06.lecture.p5static;

public class A01InstanceMember {
	public static void main(String[] args) {
		//필드와 메소드를 사용하기 전에 인스턴스가 생성돼야 함
		//필드와 메소드는 인스턴스멤버
		//(인스턴스) 필드
		//(인스턴스) 메소드
		MyClass1 o1 = new MyClass1();
		o1.i = 3;
		o1.method();
		
		MyClass1 o2 = new MyClass1();
		o2.i = 5;
		o2.method();
		
		System.out.println(o1.i);
		System.out.println(o2.i);
	}
}
