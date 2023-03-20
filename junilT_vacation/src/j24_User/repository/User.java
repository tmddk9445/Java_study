package j24_User.repository;

import j24_User.controller.dto.SigninDto;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private int usercode;
	private String name;
	private String email;
	private String username;
	private String password;
	
	public SigninDto toDto() {
		return SigninDto.builder()
				.usercode(usercode)
				.name(name)
				.email(email)
				.username(username)
				.password(password)
				.build();
	}
}





