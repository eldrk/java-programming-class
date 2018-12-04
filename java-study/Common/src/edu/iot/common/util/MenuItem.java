package edu.iot.common.util;

import edu.iot.common.command.Command;

public class MenuItem extends Menu {
	
	Command command; //관련명령
	
	public MenuItem(String title, Command command) {
		super(title);
		this.command = command;
	}

	@Override
	public void execute() throws Exception {
		if(command != null) {
			command.execute();
		}

	}

}
