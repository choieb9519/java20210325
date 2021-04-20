package p11.lecture.object;

public class A05HashCode {
	//서로 다른 객체는 다른 값을 가지고 있다.
	//hash code는 해시함수의 결과값
	//헤시함수: 어떤 객체를 표현하는 값
	//어떤 객체를 해시함수에 통과시키면 해시값이 나옴
	//어떤 값을 넣으면 참조 값이 나오도록되어있음
	//보통 분류하는 목적으로 사용함(방 번호로 생각하기)
	
	public static void main(String[] args) {
		//해시코드가 다르면 equals가 다르게 나옴(f)
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		//hashcode로 재정의 해서 같은 방에 있는지 확인 후
		
		System.out.println(o1.equals(o2));
		//equals로 같은 객체인지 확인
		//이 두개는 항상 같이 쓰임
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2)); //t
		//같은 객체라면 같은 방에 있어야함
		//p461그림 참조
	}
}
