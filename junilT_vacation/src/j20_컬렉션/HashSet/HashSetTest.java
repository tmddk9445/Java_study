package j20_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetTest {

	public static void main(String[] args) {
		String[] names = {"곽다은", "곽다은", "감승현", "이희산", "김지원", "최영찬", "안창은"};
		List<String> nameList = Arrays.asList(names);
		
		System.out.println(nameList);
		
		HashSet<String> nameSet = new HashSet<String>();
		nameSet.addAll(nameList);
		
		System.out.println(nameSet);
		
		// 값 추가
		nameSet.add("김준일");
		System.out.println(nameSet);
		
		// 값 제거
		nameSet.remove("김준일");
		System.out.println(nameSet);
		
		Iterator<String> ir = nameSet.iterator();
		
		while(ir.hasNext()) {
			String name = ir.next();
			System.out.println(name.equals("곽다은"));
		}
	}

}





