package edu.iot.part3.chapter18_20180809;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args){
		try(//제일많이쓰이는 형태
				BufferedReader br = new BufferedReader(new FileReader("c:/temp/article.txt"));
	  ){
			String lineString;
			while( (lineString = br.readLine()) != null) {
				System.out.println(lineString);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
