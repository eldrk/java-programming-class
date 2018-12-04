package edu.iot.libra;

import edu.iot.libra.command.Application;
import edu.iot.libra.command.ExitCommand;
import edu.iot.libra.command.ScheduleAddCommand;
import edu.iot.libra.command.ScheduleDeleteCommand;
import edu.iot.libra.command.ScheduleListCommand;
import edu.iot.libra.command.ScheduleUpdateCommand;
import edu.iot.libra.ui.Menu;
import edu.iot.libra.ui.MenuItem;

public class App extends Application {

	@Override
	public void createMenu(Menu menu) {
		menu.add(new MenuItem("추가 ",new ScheduleAddCommand()));
		menu.add(new MenuItem("목록 ",new ScheduleListCommand()));
		menu.add(new MenuItem("수정 ",new ScheduleUpdateCommand()));
		menu.add(new MenuItem("삭제 ",new ScheduleDeleteCommand()));
		menu.add(new MenuItem("종료 ",new ExitCommand()));

	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

}
