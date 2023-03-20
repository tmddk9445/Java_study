package j18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StudentDto {
	private int studentCode;
	private String studentName;
	private String studentAddress;
}
