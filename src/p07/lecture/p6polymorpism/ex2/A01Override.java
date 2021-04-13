package p07.lecture.p6polymorpism.ex2;

public class A01Override {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		k1.cry();
		//실제 인스턴스 야옹~~~이 출력됨
		
		KindaCat k2 = new Tiger();
		k2.cry();
		//실제 인스턴스 어흥!!!이 출력됨
		
		KindaCat k3 = new KindaCat();
		k3.cry();
		//실제 인스턴스 고양이과가 운다가 출력됨
		
	}
}
