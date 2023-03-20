package j08_전역지역;

public class ValueArea {

	public static void main(String[] args) {
		int num1 = 10;
		
		if(num1 > 10) {
			int num2 = 10;
			if(num2 > 20) {
				int num3 = 30;
			}
			
		}else if(num1 > 9) {
			int num2 = 9;
			
		}else if(num1 > 8) {
			int num2 = 8;
					
		}else {
			int num2 = 0;
		}
	}

}
