package j13_상속.animal;

public class DowncastingMain3 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();
		animals[1] = new Human();
		animals[2] = new Tiger();
		
		for(Animal animal : animals) {
			animal.move();			
		}
		
		System.out.println();
		
		for(Animal animal : animals) {
			if(animal instanceof Human) {
				Human human = (Human) animal;
				human.readBooks();
				
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
				
			}else {
				System.out.println("Downcasting하지 않음");
				
			}
		}
	}

}




