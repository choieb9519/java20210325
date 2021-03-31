package p04.textbook;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		
		float x;
		for (x = 0.1f; x <= 1.0; x += 0.1f) {
			System.out.println(x);
		}
		System.out.println(x);
	}
}
