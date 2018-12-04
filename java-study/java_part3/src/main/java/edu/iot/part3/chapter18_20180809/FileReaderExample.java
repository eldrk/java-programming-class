package edu.iot.part3.chapter18_20180809;

import java.io.FileReader;

public class FileReaderExample {
public static void main(String[] args) {
	try (FileReader fr = new FileReader("C:/temp/article.txt"))
	{
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo =fr.read(cbuf)) != -1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.print(data);
		}
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
