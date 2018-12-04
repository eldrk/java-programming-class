package edu.iot.jdbc_test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.iot.jdbc_test.model.Employee;

public class JDBCEx5 {
	public static void main(String[] args) {
		
	Connection conn = Database.getConnection();
	String sql = "select * from employees";
	
	try(Statement stmt = conn.createStatement()){
		try(ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
				Employee emp = Employee.builder()
												.employeeId(rs.getLong("employee_id"))
												.lastName(rs.getString("last_name"))
												.build();		
	
				System.out.println(emp);
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	Database.close();
}

}