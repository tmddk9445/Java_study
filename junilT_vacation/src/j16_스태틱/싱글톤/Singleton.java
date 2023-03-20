package j16_스태틱.싱글톤;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void printInfo() {
		System.out.println("싱글톤 테스트");
	}
}
