package p06.textbook.s061301.package2; //<-패키지가 다름

import p06.textbook.s061301.package1.B;

public class C {
//	A a;  <-A 클래스 접근 불가(컴파일 에러)
	B b; //<-B는 import하면 가능
}
