package j02_변수;

public class MyInfo {

	public static void main(String[] args) {
		/*
		 * 이름: 김준일					name	문자열
		 * 성별: 남						gender	문자
		 * 나이: 29						age		정수
		 * 주소: 부산 동래구 사직동		address	문자열
		 * 이메일: skjil1218@kakao.com	email	문자열
		 * 연락처: 010-9988-1916		phone	문자열
		 */
		
		String name = "김준일";
		char name1 = '김';
		char name2 = '준';
		char name3 = '일';
		char gender = '남';
		int age = 29;
		String address = "부산 동래구 사직동";
		String email = "skjil1218@kakao.com";
		String phone = "010-9988-1916";
		
		name3 = '이';
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("성별: ");
		System.out.println(gender);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.print("이메일: ");
		System.out.println(email);
		System.out.print("연락처: ");
		System.out.println(phone);
	}

}




