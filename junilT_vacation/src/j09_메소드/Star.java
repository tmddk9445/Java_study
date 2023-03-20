package j09_메소드;

import java.util.Scanner;

public class Star {

	public static void printStar(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printStar(String n) {
		int n2 = Integer.parseInt(n);
		
		for(int i = 0; i < n2; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static String inputN() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("별을 몇번 찍을까요? ");
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		String n = inputN();
		System.out.println("입력받은 n: " + n);
		printStar(n);
		printStar(5);
	}

}






