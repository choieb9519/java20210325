package p06.lecture.p6final;

public class A01Final {
	final static int f ;
	//== static final int f; 순서 상관x
	
	static {
		f = 55;
	} //== final static int f = 55;
	//스테틱파이널에서도 초기화값이 꼭 필요
	
	final static double PI = 3.1415;
	//상수를 final static으로 정의(모두 대문자)
	
	int a;
	final int b;
	
	A01Final() {
		this.b = 9;
	}//필드파이널에선 초기화값이 꼭 필요
	//final int b = 9;처럼도 가능
	
	public static void main(String[] args) {
		//final변수(지역변수, 파라미터, 필드포함)는
		//값을 한 번만 할당 받을 수 있음
		
		final int i;
		int j;
		
		j = 3;
		j = 5;
		i = 9;
//		i = 10; x
	}
	
	static void method1(final int i) {
		System.out.println(i);
//		i = 3; x
	}
}
