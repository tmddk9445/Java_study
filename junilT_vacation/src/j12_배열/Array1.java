package j12_배열;

public class Array1 {

	public static void main(String[] args) {
		String[] names = new String[10];
		
		int index = 0;
		
		System.out.println(names[0]);
		names[0] = "김준일";
		names[6] = "김준일";
		for(int i = 0; i < 10; i++) {
			System.out.println(names[i]);
		}
		

	}

}
