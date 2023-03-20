package j18_lombok;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
	private int student_code;
	private String student_name;
	private String student_address;
}
