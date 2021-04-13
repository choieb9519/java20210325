package p07.lecture.p6polymorpism.ex3;

public class A02AbstractMethod {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
		k1.cry();
		k2.cry();
	}
}
