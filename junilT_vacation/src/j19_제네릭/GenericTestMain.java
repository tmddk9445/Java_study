package j19_제네릭;

public class GenericTestMain {

	public static void main(String[] args) {
		GenericTest<String> gt = new GenericTest<String>("a", "b");
		GenericTest<Integer> gt2 = new GenericTest<Integer>(10, 20);
		
		
		System.out.println(gt);
		System.out.println(gt2);
		
		

	}

}
