package edu.iot.part3.chapter12;

public class BridgeTest {

	public static void main(String[] args) {
		System.out.println("시뮬레이션을 시작한다.");
		Bridge bridge = new Bridge();
		
		new Knight(bridge, "홍길동", "홍천").start();
		new Knight(bridge, "임꺽정", "임실").start();
		new Knight(bridge, "일지매", "일산").start();
		new Knight(bridge, "장보고", "장흥").start();
		new Knight(bridge, "이순신", "이천").start();
		

	}

}
