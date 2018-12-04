package chapter03;

import java.util.Scanner;

public class Ex10_LogicalOperatior {
	
	public static char toLowerCase(char charCode) {
		int ch = charCode;
		if((charCode>=65)&(charCode<=90)) {
			ch = charCode+32;
		}else {
			System.out.println("소문자로 변경할수없습니다");
		}
		return (char)ch;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
		System.out.print("정수를 입력하세요 : ");
		int charCode = sc.nextInt();

		System.out.println("charCode : " +(char)charCode);
		
		
		}
				

	}

}
