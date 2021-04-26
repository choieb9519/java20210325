package p13.lecture;

public class A08WildCard {
	public static void main(String[] args) {
		putBox(new Box8<MyClass8>());
		putBox(new Box8<Object>());
		
		getBox(new Box8<MyClass8>());
		getBox(new Box8<Child8>());
		
		allBox(new Box8<Object> ());
		allBox(new Box8<MyClass8> ());
		allBox(new Box8<Child8> ());
	}
	
	public static void putBox(Box8<? super MyClass8> box){
		box.setField(new MyClass8());  //extends는 사용 못함: MyClass보다 상위 클래스여야 하기 떄문
	}
	
	public static void getBox(Box8<? extends MyClass8>box) {
		MyClass8 o1 = box.getField(); //super는 사용 못함: MyClass보다 크면 안됨
	}
	
	public static void allBox(Box8<?> box) {
		Object o1 = box.getField();
//		box.setField(new Object());  이건 안됨
	}
}

class Box8<T> {
	private T field;
	
	public void setField(T field) {
		this.field = field;
	}
	
	public T getField() {
		return field;
	}
}

class MyClass8 {}
class Child8 extends MyClass8{}