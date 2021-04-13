package p07.lecture.p1inheritance;

public class A01Parent {
	
	public int i;
	
	public A01Parent() {
		
	}
	
	public A01Parent(int i) {
		this.i = i;
	} //생성자는 상속x
	
	public void method1() {
		System.out.println("method1");
	}
}
