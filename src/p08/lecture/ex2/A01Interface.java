package p08.lecture.ex2;

public interface A01Interface {
	public static void main(String[] args) {
		System.out.println(MyInterface.MY_FIELD1);
		System.out.println(MyInterface.MY_FIELD2);
	
		MyInterface.staticMethod1();  //인스턴스 없어도 접근 가능
		MyInterface.staticMethod2();
		
		MyClass c1 = new MyClass();
		c1.method1();
		c1.method2();
		
		c1.defaltMethod1();
		c1.defaltMethod2();
		
	}
}
