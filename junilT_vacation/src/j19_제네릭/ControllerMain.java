package j19_제네릭;

public class ControllerMain {
	
	public static void main(String[] args) {
		TestController controller = new TestController();
		
		System.out.println(controller.findByUsername("j2"));
		System.out.println(controller.findByUsername("j5"));
		
		System.out.println(controller.findByUsercode("j3"));
		System.out.println(controller.findByUsercode("j6"));
	}
	
}
