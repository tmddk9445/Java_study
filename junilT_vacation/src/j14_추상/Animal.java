package j14_추상;

/*
 * 추상(abstract)
 * 
 * 1. 추상 클래스
 * 		- 생성이 불가능하다.
 * 		- 하나 이상의 추상 메소드를 가지게 되면 
 * 			무조건 추상 클래스로 선언하여야한다.
 * 		- 추상클래스는 상속이 가능하다.
 * 
 * 2. 추상 메소드
 * 		- 접근지정자, 반환 자료형, 메소드명, 매개변수만을 정의하고
 * 			{} 중괄호를 생략하여 메소드 실행부분을 구현하지 않는다.
 * 		- 메소드 선언 후 ;(세미콜론)으로 끝이난다.
 * 
 */

public abstract class Animal { //추상 클래스
	private String test;
	
	
	public abstract void move(); //추상 메소드
	public void test() {
		System.out.println(test);
	}
}










