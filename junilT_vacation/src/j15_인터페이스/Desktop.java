package j15_인터페이스;

public class Desktop {
	private HDMI hdmi;
	
	public Desktop(HDMI hdmi) {
		this.hdmi = hdmi;
		hdmi.connect();
		hdmi.disconnect();
	}
	
	public void showInfo() {
		System.out.println("연결된 장치: " + hdmi.getClass().getSimpleName());
	}
}
