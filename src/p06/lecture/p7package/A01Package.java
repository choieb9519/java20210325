package p06.lecture.p7package;
//패키지 명시: 파일 첫 줄 package키워드 + 패키지 경로
public class A01Package {
	//클래스 선언 할 때 패키지를 명시할 수 있음
	//클래스의 풀네임은 패키지.className
	
	//이 클래스의 풀네임: p06.lecture.p7package.A01Package
	
	//패키지 작명법: 대소문자, $, _, 숫자 조합
	//               숫자로 시작x
	//작명 관숩: 회사마다 다름(lowerCamelCamal, lower_snake_case)
				 
	//A회사: ex1.test.Car
	//B회사: ex1.test.Car
	//위와 같은 문제를 피하기 위해 회사 도메인을 패키지명에 사용
	//A회사: choongang.net
	//net.choongang.ex1.test.Car
	//B회사: samsung.net
	//net.samsung.ex1.test.Car
}
