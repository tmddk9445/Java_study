package j21_익명클래스;

public class PlusOperationImpl2 implements PlusOperation {

	@Override
	public int plus(int a, int b) {
		System.out.println("두번째 방법으로 계산");
		return a + b;
	}
	
}
