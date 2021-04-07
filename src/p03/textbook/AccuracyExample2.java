package p03.textbook;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieses = apple * 10; //양 변을 정수로
		int number = 7;
		int temp = totalPieses - number;
		//82p
		double result = temp/10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result + " 조각이 남는다.");
	}
}
