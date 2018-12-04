package edu.iot.part3.chapter18_20180809;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner("Hello Java \n 12 34.5");
		Scanner scanner = new Scanner(new File("c:/temp/source.txt"));
		
		System.out.print("문자열 입력> ");
		String inputstring = scanner.nextLine();
		System.out.println(inputstring);
		System.out.println();
		
		System.out.print("정수 입력> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("실수 입력> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		System.out.println();

	}

}
