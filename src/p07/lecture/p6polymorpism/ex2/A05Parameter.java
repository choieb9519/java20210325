package p07.lecture.p6polymorpism.ex2;

public class A05Parameter {
	//매개변수의 다형성
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		
		method(k1); //cat이 넘어감
		
		KindaCat k2 = new Tiger();
		method(k2);
		
		Tiger t = new Tiger(); //타이거를 직접 넣음
		method(t);
		
		Cat c = new Cat();
		method(c);
		
		method(new Cat());
		method(new Tiger());
	}
	
	public static void method(KindaCat k) {
		k.cry();
	}
}
