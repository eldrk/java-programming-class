package edu.iot.jdbc_test;

public class JDBCEx1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 JDBC드라이버 로드 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
