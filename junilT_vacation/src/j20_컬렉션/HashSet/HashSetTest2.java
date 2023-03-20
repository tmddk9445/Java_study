package j20_컬렉션.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import j20_컬렉션.User;

public class HashSetTest2 {

	public static void main(String[] args) {
		int usercode = 20220000;
		
		String[] usernames = {"junil", "junil2", "junil3"};
		String[] passwords = {"1234", "1111", "2222"};
		String[] names = {"김준일", "김준이", "김준삼"};
		String[] emails = {"a@naver.com", "b@google.com", "c@kakao.com"};
		
		List<User> userList = new ArrayList<User>();
		Set<User> userSet = new HashSet<User>();
		
		for(int i = 0; i < usernames.length; i++) {
			User user = User.builder()
					.usercode(usercode + i)
					.username(usernames[i])
					.password(passwords[i])
					.name(names[i])
					.email(emails[i])
					.build();
			
			userList.add(user);
			userSet.add(user);
		}
		
		System.out.println(userList);
		System.out.println(userSet);
		
		////////////////////////////////////////////////////////////////
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("찾으실 사용자의 아이디를 입력하세요: ");
		String username = scanner.nextLine();
		
		
		for(int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			if(user.getUsername().equals(username)) {
				System.out.println(user);
			}
		}
		
		for(int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			if(user.getUsername().equals(username)) {
				userList.remove(i);
				break;
			}
		}
		
		System.out.println(userList);
		
		///////////////////////////////////////////////////////////////
		
		Iterator<User> ir = userSet.iterator();
		while(ir.hasNext()) {
			User user = ir.next();
			if(user.getUsername().equals(username)) {
				System.out.println(user);
				userSet.remove(user);
			}
		}
		
	}

}





