package j15_인터페이스.user.service;

public class UserServiceImpl implements UserService {

	@Override
	public boolean createUser() {
		System.out.println("초기 버전으로 사용자 등록");
		return true;
	}

	@Override
	public String getUser() {
		System.out.println("초기 버전으로 사용자 조회");
		return "김준일";
	}

	@Override
	public boolean updateUser() {
		System.out.println("초기 버전으로 사용자 수정");
		return true;
	}

	@Override
	public boolean deleteUser() {
		System.out.println("초기 버전으로 사용자 삭제");
		return true;
	}

}




