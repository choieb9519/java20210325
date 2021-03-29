package p03.lecture.p2binary.p1arithmetic;

public class A04DivideZero {
	public static void main(String[] args) {
		
		//정수는 0으로 나눌 수 없음
		int a = 3;
		int b = 0;
		
		//int c = a / b; //ArithmeticExeption발생
		//System.out.println(c); //0으로 나눌 수 없어서 문제 발생->ㅠㅡ로그램 종료
		
		
		//실수는 0으로 나누면 무한대
		double x = 3.0;
		double y = 0.0;
		
		double z = x / y;
		System.out.println(z);
		
		double w = z - 3.14;
		System.out.println(w);
		
		//실수의 0으로 나눈 나머지는 NAN(Not a Number)
		double e = 5.0;
		double f = 0.0;
		double g = e % f; //NoN
		
		System.out.println(g);
		
		double h = g + 3.14;
		System.out.println(h);
		
	}
}
