package j17_최상위클래스;

import java.util.Scanner;

import j16_스태틱.Student;

public class StringObject {

	public static void main(String[] args) {
		Student student = new Student("김준일");
		Student student2 = new Student("김준일");
		
		System.out.println(student == student2);
		System.out.println(student.equals(student2));
		
		String str1 = "김준일";
		String str2 = "김준일";
		
		System.out.println(str1 == str2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름입력: ");
		String str3 = scanner.nextLine();
		
		System.out.println(str1 == str3);
		System.out.println(str3);
		
		String str4 = new String("김준일");
		
		System.out.println(str1 == str4);
		System.out.println(str4);
		
		System.out.println(str1.equals(str4));
		
		

	}

}








