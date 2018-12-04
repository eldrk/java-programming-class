package chapter04;

//import java.util.Date;
import java.util.Scanner;//ctrl+shift+o

public class Ex16_DoWhile {
	public static void main(String[] args) {
		
		//Date date;
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		//내부에 open이라는 의미가 담겨있다
		//close를 하지않는이유는 닫을때 자동닫힌다
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
