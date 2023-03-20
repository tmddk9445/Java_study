package j06_조건;

public class Quadrant {

	public static void main(String[] args) {
		int x = 2;
		int y = -3;
		
		if(x > 0 && y > 0) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}else {
			System.out.println("4사분면");
		}
	}

}
