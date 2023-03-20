package j09_메소드;

public class Method2 {
	
	//메소드 정의
	
	//void 공허하다, 아무 의미가 없다, 값이 없다.
	
	//매개변수가 없으면서 반환도 없는 메소드
	public static void function1() {
		System.out.println("F1 실행");
	}
	
	//매개변수가 있고 반환은 없는 메소드
	public static void function2(int age, String name) {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
	}
	
	//매개변수가 없고 반환은 있는 메소드
	public static int function3() {
		return 1000;
	}
	
	//매개변수와 반환이 있는 메소드
	public static String function4(String name) {
		String madeName = name + "님";
		return madeName;
	}
	
	//리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
	public static void function5(int n) {
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				//break;
				return;
			}
			System.out.println(i);
		}
		System.out.println("function5가 정상적으로 끝이남");
	}
	
	public static String getName() {
		return "김준일";
	}
	
	public static void setName(String name) {
		String n = name;
	}
	
	public static String findUserByUsername(String username) {
		return "USER";
	}
	
	public static void main(String[] args) {
		function1(); //메소드 호출
		function2(29, "김준일");
		function2(30, "김준이");
		int result = function3();
		System.out.println(result);
		System.out.println(function3());
		System.out.println(function4("김준일"));
		function5(5);
		System.out.println("function5 다음 실행");
	}

}





