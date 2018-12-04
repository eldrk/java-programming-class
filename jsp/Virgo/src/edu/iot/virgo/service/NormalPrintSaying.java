package edu.iot.virgo.service;

import edu.iot.virgo.model.Saying;

public class NormalPrintSaying extends PrintSaying {

	@Override
	public void printHead() {
		System.out.println("==========================================");
		System.out.println("오늘의 명언");
		System.out.println("==========================================");

	}

	@Override
	public void printBody(Saying saying) {
		System.out.println();
		System.out.println(saying.getSentence());
		System.out.println();
		System.out.println("\t\t\t\t-" + saying.getWho() + "-    ");
		System.out.println();

	}

	@Override
	public void printFooter() {
		System.out.println("==========================================");

	}

}
