package p03.lecture.p2binary.p2compare;

public class A03CompareString {
	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		
//		System.out.println(a < b); string 크기 비교 불가
		
		String c = "a";
		String d = "b";
		
//		System.out.println(c < d);
		
		char e = 'a';
		char f = 'b';
		System.out.println(e < f);
		
		//동등한가(==) 동등하지 않다(!=) 비교는 가능(참조 타입 전체에서)
		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1 == str2);
		
		String str3 = "ja";
		String str4 = "va";
		
		String str5 = str3 + str4;
		System.out.println(str1);
		System.out.println(str5);
		
		System.out.println(str1 == str5); //f
		//실제 함수 값이 같은가 -> 아니다.
		
		//문자열이 같은지 확인하는 매소드
		//equals
		System.out.println(str1.equals(str5)); //boolean타입 출력
	}
}
