package p06.lecture.p8access_modifier;

public class A04Constructor {
	//생성자에도 접근지정자 가능
	//생성자를 만들지 않으면 자동으로
	//기본생성자(argument없는 생성자)추가
	//접근지정자는 class의 접근 지정자가 붙는다.
	//위와 같은 경우는 public
	
	//class의 접근지정자는 default, public만 가능
	
	private A04Constructor() {
		
	}
	
	public A04Constructor(int i) {
		
	}
	
	A04Constructor(int i, int j) {
		
	}
}
