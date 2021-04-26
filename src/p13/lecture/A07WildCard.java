package p13.lecture;

public class A07WildCard {
	public static void main(String[] args) {
		Box7<ParentGeneric7> b1 = new Box7<>();
		Box7<Generic7> b2 = new Box7<>();
		//위 둘 사이는 상위타입과 하위타입을 결정할 수 없어서
		//아래의 extends와 super로 관계 정의함
		
//		b1 = b2;  x 이 둘은 상속관계가 없음
		
		Box7<? extends ParentGeneric7> b3;
		//b2의 상위 클래스를 만듦
		//페런트7을 상속받은 어떤 것
		b3 = b2;
		
		Box7<? extends Generic7> b4;
		b4 = b2; //자기자신이니까 가능
		
		//상위 타입만 명시하고 싶을 때
		Box7<? super Generic7> b5;
		b5 = b2;
		b5 = b1; //이것도 가능
		
		Box7<? super ChildGeneric7> b6;
		b6 = b2;
	}
}

class Box7<T> {}

//상속과 관련된 내용

class ParentGeneric7 {}

class Generic extends ParentGeneric7 {}

class ChildGeneric7 extends Generic {}
 