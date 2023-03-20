package j03_연산자;

public class Score {

	public static void main(String[] args) {
		int score = 80;
		int temp = 0;
		int temp2 = 0;
		
//		score = score + 1;
		temp = score--;
		temp2 = score;
		
		System.out.println(temp);
		System.out.println(temp2);
		System.out.println(++temp2);
		System.out.println(temp2++);
		System.out.println(temp2);
	}

}







