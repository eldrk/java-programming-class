package chapter04;


import java.util.Scanner;

public class Ex21_Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		boolean result = true;
		
		for(int i=1;i<=num;i++) {
			if((num%i) == 0) {
				result = false;
				break;
			}
		}
		if(result) { //result == true
			System.out.println(num+ "은 소수입니다.");
		}else {
			System.out.println(num+ "은 소수가 아닙니다.");
		}
	}

}
