package p11.lecture.object;

public class A01Object {
	// Object class는 모든 class의 상위클래스

	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		int i = o1.hashCode();
		String s = o1.toString();
	}
}

class MyClass /* extends Object */ {

}
