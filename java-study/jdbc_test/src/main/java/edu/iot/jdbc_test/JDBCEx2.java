package edu.iot.jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx2 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		try(Connection conn =
				(Connection)DriverManager.getConnection(url,"hr","hr")){
				System.out.println("데이터베이스에 접속했습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
