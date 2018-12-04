package edu.iot.part3.chapter18_20180809;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {//무조건 닫아야할때 이걸써준다.
		try(FileInputStream fis = new FileInputStream("C:/temp/file.txt");){
			int data;
			while(( data = fis.read() ) !=-1 ) {
				System.out.write(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
//		try {
//			fis = new FileInputStream("C:/temp/file.txt");
//			int data;
//			while( (data = fis.read() ) != -1) {
//				System.out.write(data);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}finally {
//			try {
//				if(fis != null) {
//					fis.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
	}

}
