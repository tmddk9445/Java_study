package j13_상속.animal;

/*
 * @ -> 어노테이션
 * @Override
 * 부모로부터 상속받아 재정의한 메소드이다.라는 것을 표기
 */

public class Human extends Animal {
	
	public Human() {
		super();
		System.out.println("사람 한명 생성");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
