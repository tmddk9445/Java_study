package j15_인터페이스;

public class BeamProjector implements HDMI {
	
	@Override
	public void connect() {
		System.out.println("빔프로젝터를 연결합니다.");
	}
	
	@Override
	public void disconnect() {
		System.out.println("빌프로젝터 연결을 해제합니다.");
	}
	
}
