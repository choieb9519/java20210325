package p04.lecture;

public class A14DoWhile {
	public static void main(String[] args) {
		boolean a = false;
		while (a) {
			System.out.println("while code block");
		}
		
		//do while(): 코드 블럭이 최초 한번은 실행됨
		//이후 조건이 t->코드블럭, f면->다음 실행 흐름으로
		
		do { //do ctrl space
			System.out.println("do while code block");
		} while (a); //세미콜론 필수
		System.out.println("프로그램 종료");
	}
}
