package p02.textbook;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		 long longValue = 500;
		 intValue = (int) longValue;
		 System.out.println(intValue);
		 
		 double dobleValue = 3.14;
		 intValue = (int) dobleValue;
		 System.out.println(intValue);
	}
}
