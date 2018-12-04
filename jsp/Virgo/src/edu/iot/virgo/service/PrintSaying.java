package edu.iot.virgo.service;

import edu.iot.virgo.model.Saying;

public abstract class PrintSaying {
	
	public abstract void printHead();
	public abstract void printBody(Saying saying);
	public abstract void printFooter();
	
	public void print(Saying saying) {
		printHead();
		printBody(saying);
		printFooter();
	}
}
