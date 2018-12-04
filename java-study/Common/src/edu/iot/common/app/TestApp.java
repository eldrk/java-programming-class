package edu.iot.common.app;

import edu.iot.common.command.Command;
import edu.iot.common.util.Menu;
import edu.iot.common.util.MenuGroup;
import edu.iot.common.util.MenuItem;

public class TestApp extends Application {

	@Override
	public void createMenu(Menu menu) {
		
		MenuGroup fileMenu = new MenuGroup("File");
		fileMenu.add(new MenuItem("Open", new Command() {
			@Override
			public void execute() throws Exception {
				System.out.println("파일을 엽니다.");
			}
		}));
		
		fileMenu.add(new MenuItem("Save", new Command() {
			
			@Override
			public void execute() throws Exception {
				System.out.println("파일을 저장합니다.");
			}
		}));
		
		Menu printMenu = new MenuGroup("Print");
		printMenu.add(new MenuItem("Print Setup",null));
		printMenu.add(new MenuItem("Print",null));
		fileMenu.add(printMenu);
		
		fileMenu.add(new MenuItem("Exit", new Command() {//익명구현객체

			@Override
			public void execute() throws Exception {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}));
		
		menu.add(fileMenu);
		menu.add(new MenuItem("Help", new Command() {
			
			@Override
			public void execute() throws Exception {
				System.out.println("TestApp는 도움말이 없습니다.");
			}
		}));
		menu.add(new MenuItem("About",new Command() {
			
			@Override
			public void execute() throws Exception {
				System.out.println("TestApp Ver0.1");
				System.out.println("create by 재은");
			}
		}));

	}

	public static void main(String[] args) {
		TestApp app = new TestApp();
		app.run();
	}
	
}
