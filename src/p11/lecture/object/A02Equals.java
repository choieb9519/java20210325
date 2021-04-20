package p11.lecture.object;

public class A02Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
					//두 개의 인스턴스 생성 후 
		//각각 다른 인스턴스에 삽입
		//각각 다른 참조값을 가지고 있는데 같은 값을 가지고 있는가
		
		System.out.println(o1 == o2); //false
		System.out.println(o1.equals(o2)); //false
		//재정의 하지 않아서 각각 다른 값이라고 나옴
		
		String str1 = new String("java");
		String str2 = "java";
		//각각 다른 참조값을 가지고 있는데 같은 값을 가지고 있는가
		//equals 매소드를 재정의하면서 재정의함
		
		System.out.println(str1 ==str2); //false
		System.out.println(str1.equals(str2)); //true
	}
	
	
}


//equals도 object가 가지고 있는 매소드
