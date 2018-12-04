package chapter04;

public class Ex04_IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		
		for(int i=1;i<7;i++) {
			if(num == i) {
				System.out.println(+i+"번이 나왔습니다");
			}
		}
	}

}
