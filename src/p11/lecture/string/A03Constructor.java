package p11.lecture.string;

public class A03Constructor {
	public static void main(String[] args) {
		
		//String생성자
		String str1 = "java";
		
		String str2 = new String("java");
		
		//캐릭터배열 생성자
		String str3 = new String(new char[] {'j', 'a', 'v', 'a'});
									//2byte, 영문일 경우 아스키코드
		
		System.out.println(str1);  //java
		System.out.println(str2);  //java
		System.out.println(str3);  //java
		
		/*영문일 경우 아스키코드
		j: 106
		a: 97
		v: 118 */
		
		String str4 = new String(new byte[] {106, 97, 118, 97});
		System.out.println(str4);  //java, 1byte 
	}
}
