package edu.iot.scorpio.command;

import java.security.Provider.Service;

import edu.iot.common.command.Command;

public class ExitCommand implements Command {

	@Override
	public void execute() throws Exception {
		if(Service.isDirty()) {
			new SaveCommand().execute();
		}
		System.out.println("종료합니다.");
		System.exit(0);

	}

}
