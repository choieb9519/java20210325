package p03.textbook;

public class OverFlowExample {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		
		System.out.println(z);
	}
}
