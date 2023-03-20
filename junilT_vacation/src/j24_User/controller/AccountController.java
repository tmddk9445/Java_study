package j24_User.controller;

import java.util.List;
import java.util.Scanner;

import j24_User.controller.dto.CMRespDto;
import j24_User.repository.User;
import j24_User.service.AuthService;
import j24_User.session.PrincipalUser;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountController {
	
	@NonNull
	private final Scanner scanner;
	
	@NonNull
	private final AuthService authService;
	
	public CMRespDto<?> myPage() {
		
		return new CMRespDto<>(1, "마이페이지 로드 성공", null);
	}
	
	public CMRespDto<?> deleteUser() {
		boolean result = false;
		
		if(confirm()) {
			try {
				result = authService.deleteUser();
			} catch (Exception e) {
				e.printStackTrace();
				return new CMRespDto<>(-1, "회원 탈퇴 실패.", result);
			}
			return new CMRespDto<>(1, "회원 탈퇴 완료.", result);
			
		}else {
			return new CMRespDto<>(-1, "회원 탈퇴 취소.", result);
		}
	}
	
	private boolean confirm() {
		char select = 0;
		
		System.out.print("정말로 탈퇴 하시겠습니까?(y/n)");
		select = scanner.next().charAt(0);
		scanner.nextLine();
		
		return select == 'y' || select == 'Y';
	}
	
	public CMRespDto<?> userList() {
		List<User> userList = null;
		try {
			userList = authService.getUserList();
		} catch (Exception e) {
			e.printStackTrace();
			return new CMRespDto<>(-1, "리스트 불러오기 실패", userList);
		}
		
		System.out.println("[사용자 정보 리스트]");
		System.out.println("============================================================================");
		System.out.println("\t사용자코드\t이름\t이메일\t\t\t아이디\t비밀번호");
		for(User user : userList) {
			System.out.print("\t" + user.getUsercode());
			System.out.print("\t\t" + user.getName());
			System.out.print("\t" + user.getEmail());
			System.out.print("\t" + user.getUsername());
			System.out.print("\t" + user.getPassword());
			System.out.println();
		}
		System.out.println("============================================================================");
		return new CMRespDto<>(1, "리스트 불러오기 성공", userList);
	}
	
	public CMRespDto<?> updatePassword() {
		String nowPassword = null;
		String newPassword = null;
		String newRepassword = null;
		
		System.out.println("현재 비밀번호를 입력해주세요.");
		System.out.print("비밀번호: ");
		nowPassword = scanner.nextLine();
		
		if(!nowPassword.equals(PrincipalUser.getInstance().getUser().getPassword())) {
			return new CMRespDto<>(-1, "현재 비밀번호 불일치", false);
		}
		
		System.out.println("새로운 비밀번호를 입력해주세요.");
		System.out.print("비밀번호: ");
		newPassword = scanner.nextLine();
		System.out.print("비밀번호 확인: ");
		newRepassword = scanner.nextLine();
		
		if(!newPassword.equals(newRepassword)) {
			return new CMRespDto<>(-1, "새로운 비밀번호 불일치", false);
		}
		
		try {
			authService.modifyPassword(newRepassword);
			PrincipalUser.getInstance().getUser().setPassword(newRepassword);
		} catch (Exception e) {
			e.printStackTrace();
			return new CMRespDto<>(-1, "비밀번호 변경 오류", false);
		}
		
		return new CMRespDto<>(1, "비밀번호 변경 성공", true);
	}
}












