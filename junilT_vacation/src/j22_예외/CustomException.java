package j22_예외;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CustomException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
