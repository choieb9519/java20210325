package p03.lecture.p2binary.arithmetic;

public class A03Float {
	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;
		
		double c = a + b;
		System.out.println(c);
		//저장공간의 한계로 근사 값이 저장되고 근사값이 출력됨
		//컴퓨터는 2진법이고 우리가 10진법으로 입력했으니까
		//자바 뿐만 아니라 모든 곳에서 이렇게 나타남
		//금융권에선 이게 문제가 됨
	}
}
