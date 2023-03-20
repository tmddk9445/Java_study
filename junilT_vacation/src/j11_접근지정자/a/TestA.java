package j11_접근지정자.a;

public class TestA {
	private String name;
	
	public TestA() {
		
	}
	
	public TestA(String name) {
		//기본생성자
		this.name = name;
		System.out.println(this);
	}
	
	public void test() {
		System.out.println(name);
	}
}