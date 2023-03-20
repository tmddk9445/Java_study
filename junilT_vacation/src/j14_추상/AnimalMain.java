package j14_추상;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		for(int i = 0; i < animals.length; i++) {
			
			animals[i] = i % 2 == 0 ? new Human() : new Tiger();
		}
		
		for(Animal animal : animals) {
			animal.move();
		}
		
		
	}

}
