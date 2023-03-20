package j13_상속;

import java.util.Scanner;

public class Aclass {
	private String str;
	private int number;
	private Scanner scanner;
	
	public Aclass() {
		System.out.println("A 생성");
		str = "김준일";
		number = 1000;
		scanner = new Scanner(System.in);
	}
	
	public String inputString() {
		System.out.print("문자열 입력: ");
		return scanner.nextLine();
	}
	
	public void printInfo() {
		System.out.println("str = " + str);
		System.out.println("number = " + number);
	}
}








