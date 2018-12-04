package edu.iot.jdbc_test;

import java.sql.Connection;

public class JDBCEx4 {
	public static void main(String[] args) {
		
		Connection conn = Database.getConnection();
		System.out.println("데이터베이스 준비 완료");
		Database.close();
	}

}
