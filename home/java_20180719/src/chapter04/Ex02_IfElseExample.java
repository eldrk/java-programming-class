package chapter04;

public class Ex02_IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은  A 입니다.");
		}else {
			System.out.println("점수가 90점 보자 작습니다");
			System.out.println("등급은 B입니다");
		}
		
		if(score %2 ==0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
	}
}
