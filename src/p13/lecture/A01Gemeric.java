package p13.lecture;

public class A01Gemeric {
	//타입이 결정되지 않은 타입
	//<타입파라미터>를 가진 타입
	//타입파라미터 작성 규칙: 관습상 대문자 한 개
	//타입의 약자인 T를 주로 사용
	public static void main(String[] args) {
		GenericType1<Object> g1 = new GenericType1<Object>();
		GenericType1<String> g2 = new GenericType1<String>();
		GenericType1<Number> g3 = new GenericType1<>();
										//타입을 추론할 수 있으면 생략 가능
	}
}

class GenericType1<T> {
				//미완성이라 어떤 타입이든 올 수 있는 상태
}

interface GenericTypeInterface1<T, S, U> {
	
}