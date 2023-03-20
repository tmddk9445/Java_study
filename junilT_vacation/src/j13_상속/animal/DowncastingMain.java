package j13_상속.animal;

public class DowncastingMain {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();
		animals[1] = new Human();
		animals[2] = new Tiger();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();			
		}
		
		System.out.println();
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Human) {
				Human human = (Human) animals[i];
				human.readBooks();
				
			}else if(animals[i] instanceof Tiger) {
				Tiger tiger = (Tiger) animals[i];
				tiger.hunting();
				
			}else {
				System.out.println("Downcasting하지 않음");
				
			}
		}
	}

}




