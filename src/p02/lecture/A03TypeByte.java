package p02.lecture;

public class A03TypeByte {
	public static void main(String[] args) {
		
		//byte: 1byte 크기의 정수를 저장할 수 있음.
		//1byte == 8bit
		//8bit: 0000 0000 ~ 1111 1111
		
		//십진법 0 == 이진법 0000 0000
		//십진법 1 == 이진법 0000 0001
		//십진법 2 == 이진법 0000 0010
		//십진법 3 == 이진법 0000 0011
		//십진법 127 == 이진법 0111 1111
		
		//십진법 -128(127+1) == 이진법 1000 0000 -> 맨왼쪽 비트가 1이면 음수
		//십진법 -127 == 이진법 1000 0001
		//십진법 -126 == 이진법 1000 0010
		//십진법 -1 == 이진법 1111 1111
		
		//십진법 0(-1+1) == 이진법 0000 0000
		
		//최소값: -128
		//최대값: 127
		
		byte byteVar;
		byteVar = -128;
		byteVar = 127;
	}

}
