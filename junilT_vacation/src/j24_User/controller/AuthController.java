package j24_User.controller;

import java.util.Scanner;

import j24_User.controller.dto.CMRespDto;
import j24_User.controller.dto.SigninDto;
import j24_User.controller.dto.SignupDto;
import j24_User.service.AuthService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthController {
	
	@NonNull
	private final Scanner scanner;
	
	@NonNull
	private final AuthService authService;
	
	//회원가입
	public CMRespDto<?> signup() {
		int result = 0;
		SignupDto signupDto = signupView();
		
		try {
			result = authService.createUser(signupDto);
			if(result < 1) {
				return new CMRespDto<>(-1, "회원가입 실패", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new CMRespDto<>(1, "회원가입 성공", signupDto);
	}
	
	private SignupDto signupView() {
		String name = null;
		String email = null;
		String username = null;
		String password = null;
		
		System.out.println("[ 회원가입 ]");
		
		System.out.print("이름:");
		name = scanner.nextLine();
		
		System.out.print("이메일:");
		email = scanner.nextLine();
		
		while(true) {
			System.out.print("사용자이름:");
			username = scanner.nextLine();
			CMRespDto<String> response = (CMRespDto<String>) checkUsername(username);
			
			System.out.println(response.getMsg());
			if(response.getCode() > 0) {
				break;
			}
		}
		
		System.out.print("비밀번호:");
		password = scanner.nextLine();
		
		SignupDto signupDto = SignupDto.builder()
				.name(name)
				.email(email)
				.username(username)
				.password(password)
				.build();
		
		return signupDto;
	}
	
	
	
	
	//로그인
	public CMRespDto<?> signin() {
		String username = null;
		String password = null;
		
		System.out.println("[ 로그인 ]");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		SigninDto signinDto = null;
		
		try {
			signinDto = authService.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(signinDto == null) {
			return new CMRespDto<>(-1, "로그인 실패.\n회원정보를 다시 확인하세요.", signinDto);
		}
		
		return new CMRespDto<>(1, "로그인 성공.\n" 
				+ signinDto.getName() + "님 환영합니다.", signinDto);
	}
	
	//아이디 중복 체크
	private CMRespDto<?> checkUsername(String username) {
		try {
			if(authService.checkUsername(username)) {
				return new CMRespDto<>(-1, "이미 존재하는 사용자이름", username);
			}else {
				return new CMRespDto<>(1, "사용가능한 사용자이름", username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new CMRespDto<>(-1, "서비스 오류", username);
	}

}







