package edu.iot.part3.chapter12;

public class Knight extends Thread{
	
	private final Bridge bridge;
	private final String name;
	private final String address;
	
	public Knight(Bridge bridge, String name, String address) {
		this.bridge = bridge;
		this.name = name;
		this.address = address;
	}
	
	//작업스레드는 run()을 실행하는 임무
	public void run() {
		System.out.println(name + "기사가 도전한다.");
		while(true) {
			bridge.across(name, address);
		}
	}
	
}
