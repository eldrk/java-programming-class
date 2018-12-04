package edu.iot.common.util;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iot.oldcommon.command.Prompt;

public class PromptTest {
	@Test
	public void testName() throws Exception {
		Prompt p = new Prompt();
		System.out.println(p.getLines("테스트"));
	}
}
