package chapter04;

//피보나치 수열
import java.util.Scanner;

public class Ex23_Example04 {
	public static void main(String[] args) {
		int num1=1;
		int num2=1;
		int num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=num;i++) {
			num3 = num1+num2;
			System.out.println(num3);
			//오래된값은 버리고 최근값을 유지한다
			num1=num2;
			num2=num3;
			
		}
	}
}
