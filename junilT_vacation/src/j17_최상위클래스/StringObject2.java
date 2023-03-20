package j17_최상위클래스;

import java.util.Scanner;

public class StringObject2 {

	public static void main(String[] args) {
		String name1 = "김준일";	//리터럴 상수 a01 
		String name2 = "김준일";	//a01
		String name3 = new String("김준일");	//b01(a01)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름입력: ");
		String name4 = scanner.nextLine();		//c01(a01) new String("버퍼에서 입력받은 값")
		
		// == 연산
		System.out.println("name1, name2: " + (name1 == name2));
		System.out.println("name1, name3: " + (name1 == name3));
		System.out.println("name1, name4: " + (name1 == name4));
		
		System.out.println();
		
		// equals()
		System.out.println("name1, name2: " + (name1.equals(name2)));
		System.out.println("name1, name3: " + (name1.equals(name3)));
		System.out.println("name1, name4: " + (name1.equals(name4)));

	}

}





