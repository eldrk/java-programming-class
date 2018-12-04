package chapter04;

import lib.Random;

public class Ex06_SwitchExample {
	public static void main(String[] args) {
		int num = Random.rand(1,6);
		
		switch(num){
			case 1:
			case 3:
			case 5:
				System.out.println("홀수가 나왔습니다.");
				break;
			case 2:
			case 4:
			case 6:
				System.out.println("짝수가 나왔습니다.");
				break;
	
		}
	}
}
