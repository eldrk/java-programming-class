package chapter04;

import lib.Random;

public class Ex10_ForSumFrom1to100 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =1;i<=100;i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합: " +sum);
		
		sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("1~100까지 짝수의 합 : " +sum);
		
		sum=0;
		for(int i=2;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("1~100까지 짝수의 합 : " +sum);
		
		sum=0;
		for(int i=1;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("1~100까지의 홀수의 합 : " +sum);
	
		sum=0;
		int ran = Random.rand(100, 1000);
		for(int i=1;i<=ran;i++) {
			sum += i;
		}
		System.out.println("1~"+ran+"까지의 합 : " +sum);
		
		for(;;) {//무한루프
			System.out.println("룰루랄라~~~~");
		}
		
/*		for(;;) {
			;
		}*/

		
	}

}
