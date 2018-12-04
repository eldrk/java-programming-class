package edu.iot.scorpio;

import edu.iot.common.app.Application;
import edu.iot.common.util.Menu;
import edu.iot.common.util.MenuGroup;
import edu.iot.common.util.MenuItem;
import edu.iot.scorpio.command.ExitCommand;
import edu.iot.scorpio.command.LoadCommand;
import edu.iot.scorpio.command.NewPlanCommand;
import edu.iot.scorpio.command.PlanManageCommand;
import edu.iot.scorpio.command.PrintCommand;
import edu.iot.scorpio.command.RegionCommand;
import edu.iot.scorpio.command.SaveCommand;
import edu.iot.scorpio.command.Top100Command;

public class App extends Application{

	@Override
	public void createMenu(Menu menu) {
		menu.add(new MenuItem("Top100",new Top100Command()));
		menu.add(new MenuItem("권역별",new RegionCommand()));
		menu.add(new MenuItem("종료",new ExitCommand()));
		
		Menu planMenu = new MenuGroup("여행일정");
		planMenu.add(new MenuItem("새 일정",new NewPlanCommand()));
		planMenu.add(new MenuItem("열기",new LoadCommand()));
		planMenu.add(new MenuItem("저장",new SaveCommand()));
		planMenu.add(new MenuItem("일정 관리",new PlanManageCommand()));
		planMenu.add(new MenuItem("출력", new PrintCommand()));
		menu.add(planMenu);
		
		menu.add(new MenuItem("종료", new ExitCommand()));
		
	}
	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
}