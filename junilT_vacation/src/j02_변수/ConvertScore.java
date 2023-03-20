package j02_변수;

public class ConvertScore {

	public static void main(String[] args) {
		double kor = 90.5;
		double eng = 80.2;
		double math = 65.5;
		
		int total = (int) kor + (int) eng + (int) math;	// 세과목 합
		int avg = total / 3;	// 세과목 합에서 3으로 나눈 평균
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (double) avg); //78.00

	}

}
