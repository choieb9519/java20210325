package p02.textbook;

public class PromotionExample {
	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;  //int->byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;  //int <- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;  //long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double dobleValue = intValue;  //double <- int
		System.out.println(dobleValue);
		//int가 double로 변환이 가능한 이유:
		//int가 정수고 doble이 실수지만 
		//doble이 큰 용량을 담을 수 있기 때문에 변환 가능
		//but 값이 달라 질 수 있음
	}
}
