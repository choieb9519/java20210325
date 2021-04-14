package p08.lecture.ex1;

public class A01Interface {
	//인터페이스라는 새로운 타입
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Malamute d1 = new Malamute();
		
		KindaCat k1 = c1;
		Pet p1 = c1;
		p1.sit();
		
		KindaDog k2 = d1;
		Pet p2 = d1;
		p2.sit();
		
//		Pet p3 = new Pet();
		//추상적인 개념일 뿐이라서 새로운 인스턴스를 만들 수 없음
		//public과 abstract를 생략해도 됨
	}
}
