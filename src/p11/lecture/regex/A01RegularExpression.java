package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
				//정규 표현식
	//문자열의 패턴을 표현하는 문자열
	//전화번호, 주민번호, 이메일 양식 등
	//meta-character(패턴)
	//quantifier(수량)
	
	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";
		
		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);  //t
		
		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));  //t
		
		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));  //f
		
		
		regex1 = "\\d"; //숫자 하나
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));  //t

		regex1 = "\\d"; //숫자 하나
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));  //f
		
		regex1 = "\\d\\d"; //숫자 두개
		str1 = "34";
		System.out.println(Pattern.matches(regex1, str1));  //t
		
		regex1 = "\\d{3}"; //숫자 몇개
		str1 = "294";
		System.out.println(Pattern.matches(regex1, str1));  //t
		
		regex1 = "\\d{3,}"; //이상
		str1 = "3895817";
		System.out.println(Pattern.matches(regex1, str1));  //t

		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-8462-8372";
		System.out.println(Pattern.matches(regex1, str1));  //t
		
		regex1 = "\\d{3,5}";  //3개에서 5개
		str1 = "22";
		System.out.println(Pattern.matches(regex1, str1));  //f
		
		regex1 = "\\d{3,5}";  //3개에서 5개
		str1 = "2246";
		System.out.println(Pattern.matches(regex1, str1));  //t

		regex1 = "\\d+"; // == \d{1,} 한개 이상(quantifier)
		str1 = "10";
		System.out.println(Pattern.matches(regex1, str1)); //t
		
		regex1 = "\\d*"; // == \d{0,} 0개 이상
		str1= "0";
		System.out.println(Pattern.matches(regex1, str1));  //t
		
		regex1 = "\\d?"; // == \d(0,1}
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1)); //t
		
		regex1 = "010-?\\d{4}-?\\d{4}";
		str1 = "010-3849-3829";
		String str2 = "01083462739";
		String str3 = "010-38742619";
		System.out.println(Pattern.matches(regex1, str1));  //t
		System.out.println(Pattern.matches(regex1, str2));  //t
		System.out.println(Pattern.matches(regex1, str3));  //t

		regex1 = "\\w";  //문자
		str1 = "s";
		str2 = "Y";
		str3 = "2";
		String str4 = "_";
		String str5 = " ";
		System.out.println(Pattern.matches(regex1, str1));  //t
		System.out.println(Pattern.matches(regex1, str2));  //t
		System.out.println(Pattern.matches(regex1, str3));  //t
		System.out.println(Pattern.matches(regex1, str4));  //t
		System.out.println(Pattern.matches(regex1, str5));  //f

		regex1 = "\\w\\d+";
		str1 = "e15678";
		str2 = "15486";
		str3 = "_35785453";
		System.out.println(Pattern.matches(regex1, str1));  //t
		System.out.println(Pattern.matches(regex1, str2));  //t
		System.out.println(Pattern.matches(regex1, str3));  //t

		regex1 = "(java)";  //그룹화
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));  //t
		
		regex1 = "(java)+";
		str1 = "javajavajava";
		str2 = "javajavajavaj";
		System.out.println(Pattern.matches(regex1, str1));  //t
		System.out.println(Pattern.matches(regex1, str2));  //f

		regex1 = "(java|python)";  //또는
		str1 = "java";
		str2 = "pythin";
		str3 = "spring";
		System.out.println(Pattern.matches(regex1, str1));  //t
		System.out.println(Pattern.matches(regex1, str2));  //t
		System.out.println(Pattern.matches(regex1, str3));  //f

		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "python";
		str3 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));  //t
		System.out.println(Pattern.matches(regex1, str2));  //t
		System.out.println(Pattern.matches(regex1, str3));  //t
		
		regex1 = "."; //모든 문자
		str1 = "$"; //t
		str2 = "."; //t
		str3 = "A"; //t
		str4 = "9"; //t
		str5 = "_"; //t
		String str6 = " "; //t
		
		regex1 = "\\."; //.만 표현
		str1 = "$"; //f
		str2 = "."; //t
		str3 = "A"; //f
		str4 = "9"; //f
		str5 = "_"; //f
		str6 = " "; //f
		
		regex1 = "[abc]"; //[안의 문자만]
		str1 = "a";  //t
		str2 = "b";  //t
		str3 = "c";  //t
		str4 = "d";  //f
		
		regex1 = "[^abc]"; //[안의 문자만] 아니면 됨
		str1 = "a";  //f
		str2 = "b";  //f
		str3 = "c";  //f
		str4 = "d";  //t
	
		regex1 = "[a-z]"; //[안의 문자범위]
		str1 = "a";  //t
		str2 = "b";  //t
		str3 = "A";  //f
		str4 = "Z";  //f
		
		regex1 = "[a-zA-z]"; //[안의 문자범위]
		str1 = "a";  //t
		str2 = "b";  //t
		str3 = "A";  //t
		str4 = "Z";  //t
		str5 = "5";  //f
	}
}
