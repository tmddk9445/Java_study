package j15_인터페이스;

public class Monitor implements HDMI {

	@Override
	public void connect() {
		System.out.println("모니터를 연결합니다.");
	}

	@Override
	public void disconnect() {
		System.out.println("모니터 연결을 해제합니다.");
	}
	
}
