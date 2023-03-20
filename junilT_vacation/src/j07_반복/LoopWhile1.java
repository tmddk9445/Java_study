package j07_반복;

public class LoopWhile1 {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += ++num;
		}
		
		System.out.println(result);
	}

}
