package p06.textbook.excercise.ex18;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
//getInstance에서 ctrl + 1 누르면 ShopService파일에 힌트 입력됨
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
