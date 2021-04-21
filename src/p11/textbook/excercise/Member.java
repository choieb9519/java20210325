package p11.textbook.excercise;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String member = id + ": " + name;
		return member;
		//return id + ": " + name;
	}
}
