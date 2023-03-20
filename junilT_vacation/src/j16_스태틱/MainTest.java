package j16_스태틱;

import j16_스태틱.싱글톤.Singleton;

public class MainTest {
	
	public void test() {
		System.out.println("테스트 메소드 호출");
	}

	public static void main(String[] args) {
		MainTest mainTest = new MainTest();
		mainTest.test();
	}
	
}
