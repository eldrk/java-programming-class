package chaper02;

import java.util.Scanner;

public class Ex08_ChekValueBeforeCasting {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)){
			System.out.println("byte 타입으로 변환할 수 없습니다");
			System.out.println("값을 다시 확인해주세요");
		}else {
			byte b = (byte)i;
			System.out.println(b);
		}
		
	}

}
