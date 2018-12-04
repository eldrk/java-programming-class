package edu.iot.part3.chapter12;

public class Bridge {
	private int counter = 0;
	private String name = "아무개";
	private String address = "모름";
	
	//동기화 공유객체연결
	public synchronized void across(String name, String address) {
		this.counter++;
		this.name = name;
		this.address = address;
		check();
		
		
	}
	
	public synchronized String toString() {
		return "이름:" +name+ ", 출신:" + address+ ", 도전 횟수:" +counter;
	}
	
	public void check() {
		if(name.charAt(0) != address.charAt(0)) {
			System.out.println("문제발생!!! " +toString());
		}
	}
}
