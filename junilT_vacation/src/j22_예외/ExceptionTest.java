package j22_예외;

public class ExceptionTest {

	public void arrayExceptionTest() throws Exception {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i + 1]);
		}
	}
}
