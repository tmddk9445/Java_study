package j09_메소드;

public class Method1 {
	
	public static int calc(int 시급, double 요율) {
		int 월급 = 0;
		월급 = (int) ((시급 + (시급 * 요율)) * 8 * 20);
		return 월급;
	}

	public static void main(String[] args) {
		
		int 월급A = calc(10000, 0.5);
		int 월급B = calc(10000, 1.5);
		int 월급C = calc(10000, 2.5);
		int 월급D = calc(10000, 3.5);
		int 월급E = calc(10000, 4.5);
		
		System.out.println(월급A);
		System.out.println(월급B);
		System.out.println(월급C);
		System.out.println(월급D);
		System.out.println(월급E);
		
		
		/*
		 * 사람A(사원) : 시급(10000) + 요율(시급 * 0.5%)
		 * 사람A(대리) : 시급(10000) + 요율(시급 * 1.5%) 
		 * 사람A(과장) : 시급(10000) + 요율(시급 * 2%) 
		 * 사람A(이사) : 시급(10000) + 요율(시급 * 5%) 
		 * 
		 */
		
	}

}
