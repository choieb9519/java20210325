package p02.textbook;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125; //126,127(->-128)128(->126)  //129는 안됨
		int var2 = 125; //21억까지 사용 가능
		
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	
}
}
