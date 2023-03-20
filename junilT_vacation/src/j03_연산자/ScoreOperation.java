package j03_연산자;

public class ScoreOperation {

	public static void main(String[] args) {
		int score = 55;
		
		String grade = score < 0 || score > 100 ? "계산 불가"
				: score > 89 ? "A학점"
				: score > 79 ? "B학점"
				: score > 69 ? "C학점"
				: score > 59 ? "D학점"
				: "F학점";
		
		System.out.println("결과: " + grade);

	}

}
