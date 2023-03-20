package j16_스태틱;

public class Student{
	private static int autoIncrement_studentCode = 20220000;
	private int studentCode;
	private String name;
	
	public Student(String name) {
		super();
		autoIncrement_studentCode++;
		this.studentCode = autoIncrement_studentCode;
		this.name = name;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
}
