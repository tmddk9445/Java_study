package j18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class User {
	private int usercode;
	private String username;
	private String password;
	private String name;
	private String email;
	// 기본생성자
	// 전체생성자
	// getter&setter
	// hashCode
	// equals
	// toString
}
