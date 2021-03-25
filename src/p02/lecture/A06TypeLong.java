package p02.lecture;

public class A06TypeLong {
	public static void main(String[] args) {
		//long : 8byte(64bit)
		System.out.println("최대값");
		System.out.println("Long.MAX_VALUE");
		System.out.println("최소값");
		System.out.println("Long.MIN_VALUE");
		
		long longVar;
		longVar = 9223372036854775807L; //대문자 L붙이기
		longVar = -9223372036854775808L;
		longVar = -9223372036854775809L; //not ok
		longVar = 9223372036854775808L; //not ok
		
		long VAR = 1_000_000;
		long VAR = 100_000;
	}
}
