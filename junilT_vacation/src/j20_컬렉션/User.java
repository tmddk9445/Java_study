package j20_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private int usercode;
	private String username;
	private String password;
	private String name;
	private String email;
}







