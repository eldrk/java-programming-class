package edu.iot.virgo;

import java.util.Scanner;

import edu.iot.virgo.model.Saying;
import edu.iot.virgo.service.FamousSaying;
import edu.iot.virgo.service.NormalPrintSaying;

public class FamousSayingApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			FamousSaying fs = FamousSaying.getInstance();
			Saying saying = fs.getSaying();
			fs.print(new NormalPrintSaying(), saying);
			
			System.out.print("다음 명언을 보시겠습니까? 'y' or 'n'");
			String st = sc.nextLine();
			if(st.equals("n")) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println();
			System.out.println();
		}
		}
	}//cmd실행시 java -jar famoussaying.jar


