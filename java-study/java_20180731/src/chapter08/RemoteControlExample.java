package chapter08;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(29);
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(18);
		rc.setMute(true);
		
		rc.setVolume(12);
		rc.setMute(false);
		

	}

}
