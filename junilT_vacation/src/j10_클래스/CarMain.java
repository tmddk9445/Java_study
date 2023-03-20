package j10_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 차량 3대
		 * 
		 * 기아자동차
		 * k3
		 * 화이트
		 * 
		 * 현대자동차
		 * 쏘나타
		 * 블랙
		 * 
		 * BMW
		 * 520d
		 * 레드
		 * 
		 */
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "기아자동차";
		c1.model = "k3";
		c1.color = "화이트";
		
		c2.company = "현대자동차";
		c2.model = "쏘나타";
		c2.color = "블랙";
		
		c3.company = "BMW";
		c3.model = "520d";
		c3.color = "레드";
		
		c1.showInfo();
		c2.showInfo();
		c3.showInfo();

	}

}






