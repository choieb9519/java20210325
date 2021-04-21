package p11.lecture.object;

public class A07ToString {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		String s1 = o1.toString();
		//이 객체를 설명하는 스트링(문자열)을 리턴
		System.out.println(s1);
		//재정의하지 않은 toString은 의미 있는 값이 나오진 않음
		//타입@참조값(16진법)
		
		String s2 = o1.toString();
		System.out.println(s2);
		
		Student st1 = new Student(3, "donald");
		String str1 = st1.toString();
		System.out.println(str1);
		//타입@해시코드

		Student st2 = new Student(99, "trump");
		String str2 = st2.toString();
		System.out.println(str2);
		
		System.out.println(st1);
		System.out.println(st2);
		//이 객체의 toString매소드를 실행한 결과를 보여줌
	}
}

class Student{
	private int id;
	private String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String desc = "id: " + id + ", " + "name: " + name;
		//의미있는 데이터는 내가 판단함
		//이름이 필요 없으면 안써도 되고 그런거임
		
		return desc;	
		//다형성에 의해 이 매소드가 실행됨
	}
}