package j07_반복;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 8) {
				System.out.println("continue 실행");
				continue;
			}
			System.out.println(i);
		}
	}

}
