package p05.lecture;

public class A05StringLiteral {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java"; //String t와는 같지만 s와는 다름
		
		System.out.println(s == t);
		System.out.println(t == u);
		
	}
}
