package p07.lecture.p6polymorpism.ex2;

public class A07ClassCastException {
	public static void main(String[] args) {
		KindaCat k1 = new Tiger();
		
		Tiger t1 = (Tiger) k1;
//		Cat c1 = (Cat) k1;  오류->캐스트 함부로 하지 말 것
		
		
		System.out.println("프로그램 종료");
	}
}
