package j22_예외;

public class Exception3 {

	public static void main(String[] args) {
		
		ExceptionTest exceptionTest = new ExceptionTest();
		
		try {
			exceptionTest.arrayExceptionTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(10 > 5) {
				throw new CustomException("우리가 만든 예외");				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상적으로 종료됨.");
	}
}







