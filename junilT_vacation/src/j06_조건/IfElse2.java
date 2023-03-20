package j06_조건;

public class IfElse2 {

	public static void main(String[] args) {
		int score = 55;
		
		if(score > 89) {
			System.out.println("A학점");
		}else if(score > 79) {
			System.out.println("B학점");
		}else if(score > 69) {
			System.out.println("C학점");
		}else if(score > 59){
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
	}

}
