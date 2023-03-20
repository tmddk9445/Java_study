package j03_연산자;

/*
 * 논리 연산자(Boolean)
 * 
 * 1. && (AND연산): 곱
 * 2. || (OR연산): 합
 * 3. !  (NOT연산): 부정
 * 
 * - AND연산
 * 	특징: 하나라도 false(거짓)이면 결과는 false이다. 
 * 		즉, 모든 값이 true(참)이어야 true의 결과가 나온다.
 * 
 * 	true && true && true => true
 * 	true && false && true => false
 *  false && false && false => false
 *  
 * - OR연산
 * 	특징: 하나라도 true(참)이면 결과는 true이다.
 * 		즉, 모든 값이 false(거짓)이어야 false의 결과가 나온다.
 * 
 * 	true || true || true => true
 *  true || false || true => true
 *  false || false || false => false
 * 
 */

public class Bool {

	public static void main(String[] args) {
		int num = 9;
		
		System.out.println(num % 2 == 0 || num % 4 == 0);

	}

}






