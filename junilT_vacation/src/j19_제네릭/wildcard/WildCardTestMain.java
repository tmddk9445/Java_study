package j19_제네릭.wildcard;

import j14_추상.Animal;
import j14_추상.Human;
import j18_lombok.Student;

public class WildCardTestMain {

	public WildCarTest<?> test(int index){
		if(index == 0) {
			return new WildCarTest<>(100);
		}else if(index == 1) {
			return new WildCarTest<>(true);
		}else if(index == 2) {
			return new WildCarTest<>("문자열");
		}else if(index == 3) {
			return new WildCarTest<>(Student.builder().student_code(10).build());
		}else {
			return new WildCarTest<>(null);			
		}
	}
	
	public WildCarTest<? extends Animal> test2() {
		return new WildCarTest<>(new Human());
	}
	
	public static void main(String[] args) {
		WildCardTestMain testMain = new WildCardTestMain();
		
		System.out.println(testMain.test(0));
		Student s = (Student) testMain.test(3).getData();
		System.out.println(s.getStudent_code());
		
		((Human) testMain.test2().getData()).readBooks();
	}

}



