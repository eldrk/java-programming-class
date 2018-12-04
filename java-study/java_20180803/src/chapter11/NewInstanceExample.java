package chapter11;

import java.util.Scanner;

public class NewInstanceExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("실행 클래스명 : ");
		String className = scanner.nextLine();
		
		try {
			Class clazz = Class.forName("chapter11." + className);
			Action action = (Action)clazz.newInstance();
			action.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
