package j18_lombok;

public class UserMain {

	public static void main(String[] args) {
		User user = new User();
		User user2 = new User(1, "junil", "1234", "김준일", "skjil1218@kakao.com");
		
		System.out.println(user);
		System.out.println(user2);
		
		user.setUsercode(100);
		
		System.out.println(user.getUsercode());
		System.out.println(user);

		
	}

}
