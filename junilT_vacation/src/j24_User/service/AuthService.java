package j24_User.service;

import java.util.List;

import j24_User.controller.dto.SigninDto;
import j24_User.controller.dto.SignupDto;
import j24_User.repository.User;

public interface AuthService {
	public boolean checkUsername(String username) throws Exception;
	public int createUser(SignupDto signupDto) throws Exception;
	public SigninDto login(String username, String password) throws Exception; 
	public boolean deleteUser() throws Exception;
	public List<User> getUserList() throws Exception;
	public boolean modifyPassword(String password) throws Exception;
	
}
