package p07.lecture.p6polymorpism.ex3;

public class A01AbstractClass {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
		//instance 만들 수 x
		//KindaCat k3 = new KindaCat();
	}
}
