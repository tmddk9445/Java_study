package j05_입력;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		
		System.out.println("이름: " + name);
	}

}
