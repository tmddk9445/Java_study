package j18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class User2 {
	@NonNull
	private final int usercode;
	@NonNull
	private final String username;
	private String password;
	private String name;
	private String email;
}












