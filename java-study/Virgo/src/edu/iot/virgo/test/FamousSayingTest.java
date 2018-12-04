package edu.iot.virgo.test;

import edu.iot.virgo.model.Saying;
import edu.iot.virgo.service.FamousSaying;
import edu.iot.virgo.service.TodayPrintSaying;

public class FamousSayingTest {
	public static void main(String[] args) {
		//FamousSaying 생성 및 랜덤화 테스트
		
		FamousSaying fs = FamousSaying.getInstance();
		/*
		Saying[] arr = fs.getArchive();
		for(Saying s : arr) {
			System.out.println(s);
		}
		*/
		
		/*
		System.out.println(fs.getSaying());
		System.out.println(fs.getSaying());
		System.out.println(fs.getSaying());
		*/
		Saying saying = fs.getSaying();
		fs.print(new TodayPrintSaying(),saying);
		
		
	}

	
	
}
