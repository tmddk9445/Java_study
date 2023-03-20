package j24_User.session;

import j24_User.controller.dto.SigninDto;
import lombok.Data;

@Data
public class PrincipalUser {
	private static PrincipalUser instance = null;
	
	private SigninDto user;
	
	private PrincipalUser() {}
	
	public static PrincipalUser getInstance() {
		if(instance == null) {
			instance = new PrincipalUser();
		}
		return instance;
	}
}








