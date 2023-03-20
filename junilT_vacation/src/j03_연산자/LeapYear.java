package j03_연산자;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1999;
		
		int result = 0;
		
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
				
		System.out.println("결과: " + result);

	}

}
