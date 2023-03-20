package j20_컬렉션.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		String[] names = {"곽다은", "감승현", "이희산", "김지원", "최영찬", "최영미", "김준엽"};
		List<String> studentNames = Arrays.asList(names);
		
		/*
		 * 해당 리스트에서 김지원이라는 이름이 존재하면 
		 * 그 이름의 인덱스 번호를 찾아 remove(index)를 하는 프로그램을 작성하시오. 
		 */
		
		for(int i = 0; i < studentNames.size(); i++) {
			System.out.println(studentNames.get(i));
			System.out.println(studentNames.contains("김지원"));
		}

	}

}








