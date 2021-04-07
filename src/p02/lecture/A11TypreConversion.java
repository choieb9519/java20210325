package p02.lecture;

public class A11TypreConversion {
	public static void main(String[] args) {
		
		//자동 형변환
		byte byteVar1 = 100;
		short shortVar1 = byteVar1;
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		
		long longVar1 = intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		
		////////////////////
		
		int intVar2 = 100;
		short shortVar2 = 100;
		//shortVar2 = intVar2; //x
		
		//강제 형변환(type castimg) casting
		//원하는 값이 나오지 않을 수 있음
		shortVar2 = (short) intVar2;
		System.out.println(shortVar2);
		
		
	}
}
