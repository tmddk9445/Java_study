package j13_상속.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal human = new Human();
		Animal tiger = new Tiger();
		System.out.println();
		
		animal.move();
		human.move();
		tiger.move();
		System.out.println();
		
//		human.readBooks();
//		tiger.hunting();
	}

}
