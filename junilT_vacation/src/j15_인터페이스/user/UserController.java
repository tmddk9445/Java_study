package j15_인터페이스.user;

import j15_인터페이스.user.service.UserService;
import j15_인터페이스.user.service.UserServiceImpl2;

public class UserController {

	private final UserService userService;
	
	public UserController() {
		this.userService = new UserServiceImpl2();
	}
	
	public static void main(String[] args) {
		UserController controller = new UserController();
		controller.userService.createUser();
		System.out.println();
		System.out.println(controller.userService.getUser());
		System.out.println();
		controller.userService.updateUser();
		System.out.println();
		controller.userService.deleteUser();
	}

}



