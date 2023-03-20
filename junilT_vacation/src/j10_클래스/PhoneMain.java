package j10_클래스;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone = new Phone("애플", "아이폰", 13, "화이트");
		phone.showInfo();
		phone.setCompany("삼성");
		phone.showInfo();

		System.out.println("회사명: " + phone.getCompany());
		
	}

}
