package j02_변수;

public class Convert {

	public static void main(String[] args) {
		int num1 = 10;
		double dNum1 = num1;
		int num2 = (int) dNum1;
		char c = (char) num2;
		
		System.out.println("정수: " + num1);
		System.out.println("실수: " + (int) dNum1);
	}

}
