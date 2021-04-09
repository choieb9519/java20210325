package p06.lecture.p8access_modifier.package1;

public class MyClass1 {
	//필드의 공개범위 비교
	public int i;
	private int j;
	int k; //default(=package private)
	
	void method() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
