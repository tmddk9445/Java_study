package j24_User.controller.dto;

import j24_User.repository.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SignupDto {
	private String name;
	private String email;
	private String username;
	private String password;
	
	public User toEntity() {
		return User.builder()
				.name(name)
				.email(email)
				.username(username)
				.password(password)
				.build();
	}
}



