package edu.iot.libra.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Prompt {
	Scanner scanner;
	
	public Prompt() {
		scanner = new Scanner(System.in);
	}
	

	public String getString(String prompt) {
		System.out.print(prompt + ": ");
		return scanner.nextLine();
	}
	
	public int getInt(String prompt) {
		String str = getString(prompt);//getString불러온다
		return Integer.parseInt(str);
	}
	
	public Date getDate(String prompt) throws ParseException { 
		return getDate(prompt,"yyyy-MM-dd");
	}
	
	public Date getDate(String prompt, String pattern) throws ParseException { 
		//if문으로 확인하는것보다 강제로 확인해야하므로 던진다
		String str = getString(prompt + "(" + pattern + ")");//사용자에게 안내
		if(str.equals("")) { //그냥 enter친경우 ""생성되므로 if문으로 확인
			return new Date(); //오늘날짜
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(str);
	}
}
