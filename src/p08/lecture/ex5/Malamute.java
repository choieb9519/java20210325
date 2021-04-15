package p08.lecture.ex5;

public class Malamute extends KindaDog implements Pet, SlideDog{
	@Override
	public void bark() {
		System.out.println("왈왈~~");
	}
	
	@Override
	public void sit() {
		System.out.println("앉습니다.");
	}
	
	@Override
	public void pull() {
		System.out.println("썰매를 끕니다.");
	}
}
