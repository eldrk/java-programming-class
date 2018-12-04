package chapter04;

public class Ex08_SwitchNoBreakCase {
	public static void main(String[] args) {
		int time = lib.Random.rand(8, 4);
		System.out.println("[현재시간 : " +time+ " 시]");
		
		switch(time) {
			case 8 :
				System.out.println("출근합니다.");
				break;
			case 9 :
				System.out.println("회의를 합니다.");
				break;
			case 10 : 
				System.out.println("업무를 봅니다.");
				break;
			case 11:
				System.out.println("외근을 나갑니다.");
				break;
		}
	}
}
