package p06.lecture.p4method;

public class A09Parameter {
	//method overloading
	public static void main(String[] args) {
		MyClass9 o1 = new MyClass9();
		
		o1.method();
		o1.method(0);
		o1.method(3.14);
		o1.method(1, 2);
		o1.method(1, "hello");
		o1.method("hello", 2);
	}
}
