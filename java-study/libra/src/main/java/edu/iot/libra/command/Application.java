package edu.iot.libra.command;

import edu.iot.libra.ui.Menu;

public abstract class Application {

	Menu menu;
	
	public Application() {
		menu = new Menu();
		createMenu(menu);
	}
	
	abstract public void createMenu(Menu menu);
	
	public void clearScreen() {
		for(int i=0; i<24; i++) {
			System.out.println();
		}
	}
	
	public void run() {
		while(true) {
			try {
				menu.excute();
			} catch (Exception e) {
				System.out.println("명령 처리 중 에러가 발생했습니다.");
				System.out.println(e.getMessage());
			}
		}
	}
}
