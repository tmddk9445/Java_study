package j21_익명클래스.익명메소드;

public class LambdaTest {

	public static void main(String[] args) {
		
		PlusOperation plusOperation = (int a, int b) -> {return a + b;};
		System.out.println(plusOperation.plus(10, 20));
		
		PlusOperation2 subOperation = (int a, int b) -> {return a - b;};
		System.out.println(subOperation.sub(40, 10));
		
		// 매개변수 타입 생략 가능
		PlusOperation2 subOperation2 = (a, b) -> {
			System.out.println("test");
			return a - b;
		};
		System.out.println(subOperation2.sub(40, 10));
		
		// 리턴 생략 가능 조건(메소드 구변부에 return 외에는 다른 로직이 들어가면 안됨)
		PlusOperation3 subOperation3 = a -> a - 10 ;
		System.out.println(subOperation3.sub(50));
		
		
	}

}






