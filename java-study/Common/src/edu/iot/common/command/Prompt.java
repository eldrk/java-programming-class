package edu.iot.common.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
		String str = getString(prompt);// getString불러온다
		return Integer.parseInt(str);
	}

	public Date getDate(String prompt) throws ParseException {
		// if문으로 확인하는것보다 강제로 확인해야하므로 던진다
		String str = getString(prompt + "(yyyy-MM-dd)");// 사용자에게 안내
		if (str.equals("")) { // 그냥 enter친경우 ""생성되므로 if문으로 확인
			return new Date(); // 오늘날짜
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(str);
	}

	public int selectList(String prompt, List<String> list) {
		System.out.println("목록===============================");
		// list 목록 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d] %s\n", i, list.get(i));
		}
		System.out.println("=================================");

		// 사용자 인덱스 입력 받아 리턴
		return getInt(prompt);
	}

	public String getLines(String prompt) {
		System.out.println(prompt + ":");

		StringBuilder builder = new StringBuilder();
		while (true) {
			String str = scanner.nextLine();
			if (str.equalsIgnoreCase("END")) {
				break;
			}
			builder.append(str + "\r\n");

		}
		return builder.toString();
	}
}
