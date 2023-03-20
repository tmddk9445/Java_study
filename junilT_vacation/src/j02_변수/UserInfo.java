package j02_변수;

/*
 * 자동완성: 컨트롤 + 스페이스바
 * 
 * System.out.println() -> 자동완성: sysout + 자동완성 단축
 * main 메소드 -> 자동완성: main + 자동완성 단축
 * 
 */

/**
 * 
 * @author ITPS
 *
 */


public class UserInfo {

	public static void main(String[] args) {
		int userCode = 20220001; // 학번
		char name1 = '김';
		char name2 = '준';
		char name3 = '일';
		String name = "김준일";
		double score = 85.5;
		boolean gender = true;
		
		System.out.println("학번: " + userCode);
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.println("이름: " + name);
		System.out.println("성적: " + score);
		System.out.println("성별: " + gender);
		
		System.out.println(score + 5.5);
		System.out.println("95.5" + 1.0);
		
		
		
	}

}
