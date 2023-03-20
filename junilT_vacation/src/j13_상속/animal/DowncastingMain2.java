package j13_상속.animal;

public class DowncastingMain2 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		/*
		 * 사람
		 * 호랑이
		 * 사람
		 * 사람
		 * 동물
		 * 
		 * 전부 move()
		 * 
		 * 각각 다운캐스팅
		 * 
		 */
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Human();
		animals[3] = new Human();
		animals[4] = new Animal();
		
		for(Animal animal : animals) {
			animal.move();
		}
		
		System.out.println();
		(new Tiger()).hunting();
		
		for(Animal animal : animals) {
			if(animal instanceof Human) {
				System.out.println("사람이었습니다.");
				((Human) animal).readBooks();
			}else if(animal instanceof Tiger) {
				System.out.println("호랑이었습니다.");
				((Tiger) animal).hunting();
			}else {
				System.out.println("동물입니다.");
			}
		}
		
	}

}




