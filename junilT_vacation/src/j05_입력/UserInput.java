package j05_입력;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		/*
		 * String name						next()
		 * int age							nextInt()
		 * String birthday(1994 09 07)		nextLine()
		 * String phone						next()
		 * String email						next()
		 * String address					nextLine()
		 * char gender						next().charAt(0)
		 * 
		 * 
		 * 이름: 김준일
		 * 나이: 29
		 * 생년월일: 1994 09 07
		 * 연락처: 010-9988-1916
		 * 이메일: skjil1218@kakao.com
		 * 주소: 부산 동래구 사직동
		 * 성별: 남
		 */

		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String birthday = null;
		String phone = null;
		String email = null;
		String address = null;
		char gender = 0;
		
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("생년월일: ");
		birthday = scanner.nextLine();
		System.out.print("연락처: ");
		phone = scanner.next();
		System.out.print("이메일: ");
		email = scanner.next();
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("생년월일: " + birthday);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: " + email);
		System.out.println("주소: " + address);
		System.out.println("성별: " + gender);
		
	}

}








