package p08.lecture.ex5;

public class A01TyprCasting {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		d1.bark();
		d1.pull();
		d1.sit();
		
		Pet p1 = d1;
//		p1.bark();  x
		p1.sit();  //o
//		p1.pull();  x
		
		SlideDog s1 = d1;
//		s1.bark();  x
//		s1.sit();  x
		s1.pull();  //o
		
		KindaDog k1 = d1;
		k1.bark();  //o
//		k1.sit();  x
//		k1.pull();  x
		
		//상위타입으로는 자동형변환
		//하위타입으로는 강제형변환
		Malamute d2 = (Malamute)k1;
		d2.bark();
		d2.pull();
		d2.sit();
		
		Wolf w1 = (Wolf) k1;
		w1.bark();
		//컴파일에서 에러 안알려줌
		//강제형변환 오류
		//이후의 statement 실행되지 않음
		
		System.out.println("시스템종료");
	}  
}
