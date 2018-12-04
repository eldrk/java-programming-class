package edu.iot.libra.service;

import org.junit.Test;

import edu.iot.libra.command.ExitCommand;
import edu.iot.libra.command.ScheduleAddCommand;
import edu.iot.libra.command.ScheduleDeleteCommand;
import edu.iot.libra.command.ScheduleListCommand;
import edu.iot.libra.command.ScheduleUpdateCommand;
import edu.iot.libra.ui.Menu;
import edu.iot.libra.ui.MenuItem;

public class MenuTest {

	@Test
	public void testMenu() {
		Menu menu = new Menu();
		menu.add(new MenuItem("추가 ",new ScheduleAddCommand()));
		menu.add(new MenuItem("목록 ",new ScheduleListCommand()));
		menu.add(new MenuItem("수정 ",new ScheduleUpdateCommand()));
		menu.add(new MenuItem("삭제 ",new ScheduleDeleteCommand()));
		menu.add(new MenuItem("종료 ",new ExitCommand()));
		
		while(true) {
			try {
				menu.excute();
			} catch (Exception e) {
				System.out.println("명령 처리중 에러가 발생했습니다.");
				System.out.println(e.getMessage());
			}
		}
	}
	

}
