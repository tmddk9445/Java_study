package j18_lombok;

public class StudentMain {

	public static void main(String[] args) {
		StudentDto studentDto = new StudentDto(100, "김준일", "부산광역시");
		
		Student student = Student.builder()
				.student_code(200)
				.build();
		
		System.out.println(studentDto);
		System.out.println(student);
	}

}
