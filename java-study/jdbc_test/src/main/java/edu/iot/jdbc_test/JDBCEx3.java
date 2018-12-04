package edu.iot.jdbc_test;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCEx3 {
	public static void main(String[] args) {
		try {
		Properties properties = new Properties();
		String path = JDBCEx3.class.getResource(
				"/database.properties").getPath();
			properties.load(new FileReader(path));
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			System.out.println(driver);
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
			
			Class.forName(driver);
			try(Connection conn=
			(Connection)DriverManager.getConnection(url, username, password)){
				System.out.println("데이터베이스에 접속했습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
