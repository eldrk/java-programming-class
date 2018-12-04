package edu.iot.scorpio.command;

import org.junit.Test;

import edu.iot.common.command.Command;

public class RegionCommandTest {
	
	@Test
	public void testRegion() throws Exception {
		Command command = new RegionCommand();
		command.execute();
	}
}
