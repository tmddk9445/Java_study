package j24_User;

import java.util.Scanner;

import j24_User.controller.AccountController;
import j24_User.controller.AuthController;
import j24_User.controller.dto.CMRespDto;
import j24_User.controller.dto.SigninDto;
import j24_User.service.AuthServiceImpl;
import j24_User.session.PrincipalUser;

public class ApplicationMain {
	private AuthController authController;
	private AccountController accountController;
	
	private Scanner scanner;
	
	public ApplicationMain() {
		scanner = new Scanner(System.in);
		AuthServiceImpl authServiceImpl = new AuthServiceImpl();
		authController = new AuthController(scanner, authServiceImpl);
		accountController = new AccountController(scanner, authServiceImpl);
	}
	
	public static void main(String[] args) {
		ApplicationMain applicationMain = new ApplicationMain();
		applicationMain.start();
	}
	
	private void start() {
		while(true) {
			mainMenu();
			String select = selectMenu();
			if(select.equals("1")) {
				CMRespDto<?> cmRespDto = authController.signin();
				showResponse(cmRespDto);
				if(cmRespDto.getCode() == 1) {
					PrincipalUser principalUser = PrincipalUser.getInstance();
					principalUser.setUser((SigninDto) cmRespDto.getData());
					myPageLoad();
				}
				//System.out.println("로그인 중인 사용자: " + PrincipalUser.getInstance().getUser());
				
			}else if(select.equals("2")) {
				showResponse(authController.signup());
				
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료중...");
				for(int i = 0; i < 100; i++) {
					System.out.println(i + 1 + " / 100");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			}else {
				System.out.println("다시 선택하세요.");
			}
			System.out.println("\n\n\n\n\n\n");
		}
		System.out.println("프로그램 종료.");
		
	}
	
	private void mainMenu() {
		System.out.println("===========================");
		System.out.println("사용자 관리 프로그램");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("q. 프로그램 종료");
		System.out.println("===========================");
	}
	
	private String selectMenu() {
		System.out.print("선택: ");
		return scanner.nextLine();
	}
	
	private void showResponse(CMRespDto<?> cmRespDto) {
		System.out.println("응답 코드: " + cmRespDto.getCode());
		System.out.println("응답 메세지: " + cmRespDto.getMsg());
		System.out.println("응답 데이터: " + cmRespDto.getData());
	}
	
	private void myPageLoad() {
		PrincipalUser principalUser = PrincipalUser.getInstance();
		
		while(true) {
			String select = null;
			System.out.println("\n\n\n\n\n\n");
			System.out.println("[" + principalUser.getUser().getName() + "님의 마이페이지 ]");
			System.out.println("1. 회원정보 수정");
			System.out.println("2. 비밀번호 수정");
			System.out.println("3. 사용자 리스트 조회");			
			System.out.println("4. 회원탈퇴");
			System.out.println("l. 로그아웃");
			select = selectMenu();
			
			if(select.equals("1")) {
				
			}else if(select.equals("2")) {
				showResponse(accountController.updatePassword());
			}else if(select.equals("3")) {
				showResponse(accountController.userList());
			}else if(select.equals("4")) {
				CMRespDto<?> response = accountController.deleteUser();
				showResponse(response);
				if((Boolean) response.getData() == true) {
					principalUser.setUser(null);
					break;
				}
			}else if(select.equals("l")) {
				principalUser.setUser(null);
				break;
			}else {
				System.out.println("다시 선택하세요.");
			}
		}
	}

}










