package j17_최상위클래스;

public class UserMain {

	public static void main(String[] args) {
		// equals
		User user1 = new User(20220001, "김준일");
		User user2 = new User(20220001, "김준일");
		
		System.out.println(user1.equals(user2));
		System.out.println(user1.hashCode() == user2.hashCode());
		System.out.println(user1);
		System.out.println(user2);

	}

}
