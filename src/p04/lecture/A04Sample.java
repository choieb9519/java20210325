package p04.lecture;

public class A04Sample {
	public static void main(String[] args) {
		int user = 3;
		int dise = (int)(Math.random() * 6) + 1;
		
		if (user == dise) {
			System.out.println("당첨되었습니다.");
		} else
			System.out.println("다시 실행해보세요.");
	}
}
