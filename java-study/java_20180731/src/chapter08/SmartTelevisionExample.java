package chapter08;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevision stv = new SmartTelevision();
		search(stv,"미션임파서블");
		Pad pad = new Pad();
		search(pad,"메르스");
		setVolume(stv,21);
		
	}
	public static void search(Searchable tv, String url) {
		tv.search(url);
	}
	
	public static void setVolume(RemoteControl rc, int volume) {
		rc.setVolume(volume);
	}
	

}
