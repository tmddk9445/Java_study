package j12_배열;

public class ClassArrayTestMain {

	public static void main(String[] args) {
		ClassArrayTest classArrayTest = new ClassArrayTest();
		String[] names = new String[10];
		
		String[] names2 = classArrayTest.createArray(names);
		
		for(int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}


