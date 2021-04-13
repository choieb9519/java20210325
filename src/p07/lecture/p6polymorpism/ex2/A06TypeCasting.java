package p07.lecture.p6polymorpism.ex2;

public class A06TypeCasting {
	public static void main(String[] args) {
	Tiger t1 = new Tiger();
	t1.cry();
	t1.hunt();
	
	System.out.println("자동형변환");
	
	KindaCat k1 = t1;
	
	k1.cry();
//	k1.hunt();  x
	
	System.out.println("강제형변환(CASTING)");
	Tiger t2 = (Tiger) k1;
	//기본타입에서 작은 타입으로 강제 형변환 할 때 이 코드 썼음
	t2.cry();
	t2.hunt();
	}
}
