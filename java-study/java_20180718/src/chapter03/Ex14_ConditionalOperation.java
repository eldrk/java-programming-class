package chapter03;

import java.util.Scanner;

public class Ex14_ConditionalOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : (score>70)? 'C':'D');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
