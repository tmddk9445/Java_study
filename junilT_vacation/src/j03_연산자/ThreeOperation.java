package j03_연산자;

public class ThreeOperation {

	public static void main(String[] args) {
		int num = 10;
		String result = num % 2 == 0 || num % 4 == 0 ? "2의 배수 또는 4의 배수입니다." 
				: "2의 배수 또는 4의 배수가 아닙니다.";
		
		int result2 = num % 5 == 0 ? 5 : 0;
		
		char result3 = num % 5 != 0 ? 'T' : 'F';
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
