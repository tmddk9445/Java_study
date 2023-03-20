package j06_조건;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("성적을 입력하세요: ");
		score = scanner.nextInt();
		
		switch(score == 0 ? 0 : score < 101 ? score / 10 : 11) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("F학점");
				break;
			default:
				System.out.println("계산 할 수 없는 점수");
		}

	}

}
