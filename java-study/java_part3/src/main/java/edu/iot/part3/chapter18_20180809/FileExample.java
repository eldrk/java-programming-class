package edu.iot.part3.chapter18_20180809;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if(dir.exists() == false) {dir.mkdirs();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles(new FilenameFilter() {//익명구현객체
			
			@Override
			public boolean accept(File dir, String name) {//dir : Temp 
				name = name.toUpperCase();
				return name.endsWith(".MP3") || name.endsWith(".JPG");
				
				//파일들만 출력
				//File f = new File(dir,name);
				//return f.isFile();
				
				//파일 확장검사
				//name = name.toLowerCase();
				//return name.endsWith(".jpg");
			}
		});
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a    HH:mm");
		//File[] contents = temp.listFiles();
		System.out.println("날짜\t\t 시간 \t형태\t\t크기\t 이름");
		System.out.println("-------------------------------------------------------------");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
			System.out.print("\t<DIR>\t\t\t" +file.getName());
		}else {
			System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
		}
		System.out.println();
	}
}
}