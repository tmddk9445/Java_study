package j24_User.service;

import java.util.List;

import j24_User.controller.dto.SigninDto;
import j24_User.controller.dto.SignupDto;
import j24_User.repository.User;
import j24_User.repository.UserRepository;
import j24_User.session.PrincipalUser;

public class AuthServiceImpl implements AuthService {
	
	private UserRepository userRepository;
	
	public AuthServiceImpl() {
		userRepository = new UserRepository();
	}

	@Override
	public boolean checkUsername(String username) throws Exception {
		return userRepository.findUserByUsername(username) != null;
	}
	
	@Override
	public int createUser(SignupDto signupDto) throws Exception {
		User userEntity = signupDto.toEntity();
		return userRepository.save(userEntity);
	}
	
	@Override
	public SigninDto login(String username, String password) throws Exception {
		User user = userRepository.findUserByUsername(username);
		if(user == null) {
			// 존재하지 않는 사용자이름(아이디)
			return null;
		}else if(!user.getPassword().equals(password)) {
			// 비밀번호 일치하지 않음
			return null;
		}else {
			// 로그인 성공
			return user.toDto();			
		}
	}
	
	@Override
	public boolean deleteUser() throws Exception {
		int usercode = PrincipalUser.getInstance().getUser().getUsercode();
		int result = userRepository.remove(usercode);
		return result > 0;
	}
	
	@Override
	public List<User> getUserList() throws Exception {
		return userRepository.getUserList();
	}
	
	@Override
	public boolean modifyPassword(String password) throws Exception {
		int usercode = PrincipalUser.getInstance().getUser().getUsercode();
		return userRepository.updatePassword(usercode, password) > 0;
	}
}








