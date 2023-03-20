package j07_반복;

public class LoopWhileGugudan {

	public static void main(String[] args) {
		int dan = 0;
		
		while(dan < 8) {
			int dan2 = dan + 2;
			
			System.out.println(dan2 + "단");
			
			int num = 0;
			while(num < 9) {
				int num2 = num + 1;
				System.out.println(dan2 + " X " + num2 + " = " + (dan2 * num2));
				num++;
			}
			
			System.out.println();
			
			dan++;
		}
		
	}

}
