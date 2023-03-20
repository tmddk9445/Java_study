package j21_익명클래스;

public class Main {

	public static void main(String[] args) {
		PlusOperation operation = new PlusOperationImpl();
		int result = operation.plus(10, 20);
		System.out.println(result);

		PlusOperation operation2 = new PlusOperationImpl2();
		int result2 = operation2.plus(10, 20);
		System.out.println(result2);
		
		PlusOperation operation3 = new PlusOperation() {
			@Override
			public int plus(int a, int b) {
				System.out.println("인터페이스 바로 생성 및 구현");
				return a + b;
			}
		};
		
		int result3 = operation3.plus(20, 30);
		System.out.println(result3);
		
	}

}





