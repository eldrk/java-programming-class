package edu.iot.part3.chapter18_20180809;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String src =  "C:/temp/Penguins.jpg";
		String dest = "C:/temp/Penguins_copy.jpg";
		
		try{
				copyFile(src,dest);
			}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}

	public static void copyFile(String src, String dest) throws Exception{
		try(//자동으로 닫아주고 예외를 던진다
				FileInputStream fis = new FileInputStream(src);
				FileOutputStream fos = new FileOutputStream(dest);
		){
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteNo);
		}
		fos.flush();
		} 
	}
}
