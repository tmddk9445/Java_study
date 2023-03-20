package j10_클래스;

public class FishBun {
	//변수
	String material;	// 재료
	String dough;		// 반죽
	
	FishBun() { //생성자
		System.out.println("생성자 호출");
	}
	
	//메소드
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
}
