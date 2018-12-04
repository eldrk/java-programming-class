package edu.iot.part3.chapter15_20180807;

import java.text.ParseException;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

public class PromptTest {
	
	@Ignore
	@Test
	public void testGetDate() {
		Prompt prompt = new Prompt();
		try {
			Date date = prompt.getDate("생일");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
