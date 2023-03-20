package j19_제네릭;

public class TestController {
	private String[] usernames = {"j1", "j2", "j3", "j4"};
	private int[] usercode = {100, 200, 300, 400};
	
	public CMRespDto<String> findByUsername(String username) {
		for(String value : usernames) {
			if(value.equals(username)) {
				return new CMRespDto<String>(1, "존재하는 사용자", value);
			}
		}
		return new CMRespDto<String>(-1, "존재하지 않는 사용자", username);
	}
	
	public CMRespDto<Integer> findByUsercode(String username) {
		for(int i = 0; i < usernames.length; i++) {
			if(usernames[i].equals(username)) {
				return new CMRespDto<Integer>(1, username + "의 usercode를 찾음", usercode[i]);
			}
		}
		return new CMRespDto<Integer>(-1, username + "의 usercode를 찾지 못함", 0);
	}
}






