package p11.lecture.object;

public class A04Equals {
	public static void main(String[] args) {
		//참조 값이 같으면 같은 객체
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1 == o2); //f
		System.out.println(o1.equals(o2)); //f
		
		System.out.println(o1.equals(o1)); //t
		
		String s1 = "java";
		String s2 =  new String("java");
		
		System.out.println(s1 == s2); //f
		System.out.println(s1.equals(s2)); //t
		//문자열이 같으면 같은 객체라고 재정의
	}
} //선생님의 책과 내 책은 같다
