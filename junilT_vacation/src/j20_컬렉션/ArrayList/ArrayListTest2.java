package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		//리스트의 크기
		System.out.println(numList.size());
		
		//값 추가
		numList.add(5);
		numList.add(4);
		numList.add(5);
		numList.add(4);
		
		System.out.println(numList.size());
		
		//리스트 내부의 모든 값을 toString으로 출력
		System.out.println(numList);
		
		//리스트에서 인덱스로 값을 찾는 방법
		System.out.println(numList.get(1));
		
		//리스트에서 해당 인덱스 값을 제거하는 방법
		System.out.println(numList.remove(3));
		System.out.println(numList);
		
		numList.add(1, 100);
		System.out.println(numList);
		
		System.out.println(numList.contains(100));
		if(!numList.contains(101)) {			
			numList.add(101);
		}
		
		System.out.println(numList);
		
		System.out.println(numList.indexOf(5));
		System.out.println(numList.lastIndexOf(5));
	}

}








