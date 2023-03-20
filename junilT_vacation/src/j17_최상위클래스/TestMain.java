package j17_최상위클래스;

public class TestMain {
	
	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object.hashCode());
		System.out.println(Integer.toHexString(object.hashCode()));
		System.out.println(object);
	}
	
}
