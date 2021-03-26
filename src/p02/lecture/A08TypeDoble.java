package p02.lecture;

public class A08TypeDoble {
	public static void main(String[] args) {
		
		double x = 3.14 //실수 literal은 double
				//더 큰 저장공간을 가지고 있어서
				//더 많이 저장 할 수 있고 더 정교하게 표현 할 수 있음
		
		//양의 최대값
		System.out.println(Double.MAX_VALUE);
		//양의 최소값
		System.out.println(Double.MIN_VALUE);
		//음의 최대값
		System.out.println(-Double.MAX_VALUE);
		//음의 최소값
		System.out.println(-Double.MIN_VALUE);
		//양의 무힌대
		System.out.println(Double.POSITIVE_INFINITY);
		//음의 무한대
		System.out.println(Double.NEGATIVE_INFINITY);
		//NaN
	}
}
