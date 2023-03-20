package j07_반복;

import java.util.Scanner;

public class LoopWhile3 {

	public static void main(String[] args) {
		// 반복 횟수 입력을 받는다.(int n)
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int i = 0;
		
		System.out.print("반복 횟수 입력: ");
		n = scanner.nextInt();
		
		while(i < n) {
			System.out.println(i);
			i++;
		}
		
	}

}
