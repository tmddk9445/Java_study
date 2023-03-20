package j12_배열;

public class Array2 {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int result = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = ((i + 1) * 10);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}
		
		System.out.println(result);

	}

}
