package j19_제네릭;

import j18_lombok.Student;

public class GenericTestMain2 {

	public static void main(String[] args) {
		GenericTest2<String, Student> test 
			= new GenericTest2<String, Student>("김준일", Student.builder()
					.student_code(1234)
					.student_name("김준일")
					.student_address("부산")
					.build());
		
		GenericTest2<String, GenericTest<Integer>> test2 
			= new GenericTest2<String, GenericTest<Integer>>(null, null);
		
		System.out.println(test);

	}

}











