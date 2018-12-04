package chapter04;


import java.util.Scanner;

public class Ex22_Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		//boolean result = true;
		
		int i=1;
		for(;i<=num;i++) {
			if((num%i)==0) {
				break;
				}
			}
		
		if(i==num) { //loop를 다돌았는지 안돌았는지 판단
			System.out.println(num+ "은 소수입니다.");
		}else {
			System.out.println(num+ "은 소수가 아닙니다.");
		}
	}
}


