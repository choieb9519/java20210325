package p06.lecture.p8access_modifier.package1;

public class A03AccessModifireExample {
	public static void main(String[] args) {
		MyClass o1 = new MyClass1();
		
		System.out.println(o1.i);
		System.out.println(o1.j); //private  x
		System.out.println(o1.k); //default  o
		
	}
}
