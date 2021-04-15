package p08.lecture.ex5;

public class A02Instanceof {
	public static void main(String[] args) {
		KindaDog d1 = new Malamute();
		
		System.out.println(d1 instanceof KindaDog);
		//말라뮤트는 KindaDog가 맞으니까 true
		System.out.println(d1 instanceof Malamute);
		//true
		System.out.println(d1 instanceof Pet);
		//true
		System.out.println(d1 instanceof SlideDog);
		//true
		System.out.println(d1 instanceof Wolf);
		//false
		
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet) d1;
		SlideDog s1 = (SlideDog) d1;
//		Wolf w1 = (Wolf) d1;  오류
		
		System.out.println("프로그램종료");
	}
}
