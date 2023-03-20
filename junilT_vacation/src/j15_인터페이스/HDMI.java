package j15_인터페이스;

/*
 * 인터페이스(implements)
 * 1. 변수는 존재할 수 없다. 즉, 무조건 상수로 선언과 초기화가 되어 있어야한다.
 * 2. 모든 메소드는 기본적으로 추상(abstract)메소드 이다.
 * 3. 일반 메소드를 사용하고 싶다면 default를 명시해줘야한다.
 * 
 */

public interface HDMI {
//	public String test = "test";
	
	public void connect();
	public void disconnect();
//	public default void test() {
//		
//	}
}







