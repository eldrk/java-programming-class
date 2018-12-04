package edu.iot.virgo.model;

public class Saying {
	private String sentence;
	private String who;
	
	public Saying() {
	}

	public Saying(String sentence, String who) {
		super();
		this.sentence = sentence;
		this.who = who;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	@Override
	public String toString() {
		return "Saying sentence= " + sentence + " who= " + who ;
	}
	
	
	
	
}
