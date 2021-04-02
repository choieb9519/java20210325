package p05.lecture;

public class A09Null {
	public static void main(String[] args) {
		String s = "java";
		String t = "java";
		
		t = null;
		//t는 참조 값을 가지고 있지 않다.
		//참조하는 객체(instance)가 없음
		s = null;
		//s도 t도 참조하는 java객체가 없으니
		//jvm이 쓰레기 값인 java객체를 알아서 지움
		//gabage collector(gc)
	}
}
