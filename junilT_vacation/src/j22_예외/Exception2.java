package j22_예외;

import java.util.ArrayList;
import java.util.List;

import j20_컬렉션.User;

public class Exception2 {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		for(int i = 0; i < 5; i++) {
			userList.add(User.builder().usercode(i + 1).build());
		}
		//userList.add(null);
		
		try {
			for(int i = 0; i < userList.size(); i++) {
				System.out.println(userList.get(i).getUsercode());
			}
			
			for(int i = 0; i < userList.size(); i++) {
				System.out.println(userList.get(i + 1));
			}
		}catch(NullPointerException e) {
			System.out.println("null 값이라서 getUsercode()할 수 없음");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("범위 초과");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외가 발생 하든 하지 않든 실행되는 부분");
		}
		
		
		System.out.println("프로그램이 정상적으로 종료됨.");
	}
}







