package p03.lecture.p2binary.p3logical;

public class A03Logical {
	public static void main(String[] args) {
		//and &&, & (논리곱)
		//or ||, | (논리합)
		//xor ^ (배타적논리합)
		//not ! (단항연산자에서 알아봄)
		
		//and: 연산의 결과 boolean
		//양 변이 모두 true일 때만 t, 나머진 f
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		//short circuit
		int i = 3;
		System.out.println(true && (i++) > 0); //t
		System.out.println(i); //4
		System.out.println(false && (i++) > 0); //f
		System.out.println(i); //4(연산이 안됐기 때문)
		
		System.out.println(false & (i++) > 0); //f
		System.out.println(i); //5(연산을 함)
	}
}
