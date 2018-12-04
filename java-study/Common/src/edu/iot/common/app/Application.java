package edu.iot.common.app;

import edu.iot.common.util.Menu;
import edu.iot.common.util.MenuGroup;

public abstract class Application {
	Menu menu;
	public Application() {
		menu = new MenuGroup();
		createMenu(menu);
	}
	
	abstract public void createMenu(Menu menu);//필수
	
	public void init() {}//옵션
	
	public void run() {
		init();
		while(true) {
			try {
				menu.execute();
			} catch (Exception e) {
				System.out.println("명령 실행 에러 : " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
