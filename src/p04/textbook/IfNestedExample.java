package p04.textbook;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81;
					//81 이상 100이하의 수를 추출하기 위한 코드
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			} 
		} else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} 
		System.out.println("학점: " + grade);
	}
}
