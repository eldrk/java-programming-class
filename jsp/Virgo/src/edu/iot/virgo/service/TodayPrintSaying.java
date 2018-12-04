package edu.iot.virgo.service;

import java.util.Date;

import edu.iot.virgo.model.Saying;

public class TodayPrintSaying extends PrintSaying {

	@Override
	public void printHead() {
		//오늘 날짜를 헤더로 출력
		Date date = new Date();
		System.out.println("======================================");
		System.out.println(date);
		System.out.println("======================================");

	}

	@Override
	public void printBody(Saying saying) {
		System.out.println();
		System.out.println(saying.getSentence());
		System.out.println();
		System.out.println("\t\t\t\t\t-"+ saying.getWho() + "-    ");
		System.out.println();

	}

	@Override
	public void printFooter() {
		System.out.println("======================================");
	}
}
