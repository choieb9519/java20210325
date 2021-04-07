package p02.lecture;

public class A04TypeShort {
	public static void main(String[] args) {
		
		//short : 2byte (16bit)의 정수 저장
		//최소값 : 1000 0000 0000 0000 == -32,768
		//최대값 : 0111 1111 1111 1111 == 32,767
		
		short shortVar;
		shortVar = 0;
		shortVar = -32768;
		shortVar = 32767;
		//short Var = 36768; //not ok
		//short Var = -32769; //not ok
	}
}
