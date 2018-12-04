package chapter11;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		String ssn = scanner.nextLine();
		char sex = ssn.charAt(7);
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
				
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}

	}

}
