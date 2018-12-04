package edu.iot.scorpio.command;

import org.junit.Test;

import edu.iot.common.command.Command;

public class Top100CommandTest {
	@Test
	public void testTop100() throws Exception {
		Command command = new Top100Command();
		command.execute();
		
	}
}
