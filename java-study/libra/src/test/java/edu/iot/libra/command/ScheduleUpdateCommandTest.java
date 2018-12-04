package edu.iot.libra.command;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScheduleUpdateCommandTest {
	@Test
	public void testUpdate() throws Exception {
		Command command = new ScheduleUpdateCommand();
		command.execute();
	}
}
