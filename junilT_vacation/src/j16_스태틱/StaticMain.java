package j16_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		StaticTest.count = 30;
		StaticTest.staticMethod();
		
		
		StaticTest staticTest = new StaticTest();
//		staticTest.count = 10;
		staticTest.staticMethod();
		
		StaticTest staticTest2 = new StaticTest();
//		staticTest2.count = 20;
		staticTest2.staticMethod();
		staticTest.staticMethod();
	}

}
