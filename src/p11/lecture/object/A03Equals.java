package p11.lecture.object;

public class A03Equals {
	public static void main(String[] args) {
		Book b1 = new Book("java", "trump");
		Book b2 = new Book("c++", "donald");
		
		System.out.println(b1 == b2); //false
		System.out.println(b1.equals(b2)); //false
		
		Book b3 = new Book("spring", "summer");
		Book b4 = new Book("spring", "summer");
		
		System.out.println(b3 == b4); //false
		System.out.println(b3.equals(b4)); //false
	}
}

class Book{
	private String title;
	private String writer;
	
	public Book(String title, String writer) {
		super();
		this.title = title;
		this.writer = writer;
	}
	//[source]-generate constructor using fields
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
		
		//book타입으로 형변환
		Book o = (Book) obj;
		
		// TODO Auto-generated method stub
		return this.title.equals(o.title)
				&& this.writer.equals(o.writer);
		}							//obj.writer대신 o.writer사용
		
		return false;
	}
}
