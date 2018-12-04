package edu.iot.part3.chapter15_20180807;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiseExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiseExample.class.getResource
				("/database.properties").getPath();//없을수도있으므로 항상 예외가따른다
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		
		System.out.println("driver  : " +driver);
		System.out.println("url 	: " +url);
		System.out.println("username: " +username);
		System.out.println("password: " +password);
		
		try {
			Class.forName(driver);
			System.out.println(driver + "가 준비됬습니다.");
		} catch (Exception e) {
			System.out.println(driver + "가 준비되지 않았습니다.");
		}
		

	}
}
