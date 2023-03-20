package j22_예외;

public class Exception1 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i + 1]);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 범위 초과");
			}
			System.out.println("test");
		}
		
		System.out.println("프로그램이 정상적으로 종료됨.");
	}
}
