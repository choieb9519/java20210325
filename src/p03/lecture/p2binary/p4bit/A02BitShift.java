package p03.lecture.p2binary.p4bit;

public class A02BitShift {
	public static void main(String[] args) {
		// left shift <<: 왼쪽으로 비트 이동
		// right shift >>: 오른쪽으로 비트 이동
		// right shift >>>: 오른쪽으로 비트 이동

		int a = 99; //0110 0011
		// a << 1     1100 0110
		int b = a <<1; 
		System.out.println(b);
		
		b = a << 2; //01 1000 1100
		System.out.println(b);
}
}
