package edu.iot.test.Json.unit;

import java.io.FileInputStream;

public class JsonSimpleExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/temp/restaurant.txt");
			int data;
			while ( (data = fis.read() ) != -1 ) { // 1byte씩 읽고 콘솔에 출력
			System.out.write(data);
			}
			fis.close();
			} catch(Exception e) {
			e.printStackTrace();
			}
	}

}
