package edu.iot.jdbc_test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.iot.jdbc_test.Database;
import edu.iot.jdbc_test.model.Employee;


public class EmployeeTempDao {
	private Connection conn = Database.getConnection();
	
	public int count() throws Exception{
		String sql = "select count(*) cnt from hr.employees";
		//count함수는 행이 항상 하나나온다
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
				rs.next();
				//return rs.getInt(1);
				return rs.getInt("cnt");
		}
	}
	
	//Primary Key(employee_id 칼럼)로 찾기
	public Employee findById(long id) throws Exception{
		String sql = "select * from hr.employees " +
								 "where employee_id = " +id;
		Employee emp = null;
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
				if(rs.next()) {
					//조회됬으면 ResultSet -> employee로변환
					emp = map(rs);
				}
		}
		return emp;
	}
	
	//Employees 테이블의 전체 리스트 리턴
	public List<Employee> getList() throws Exception{
		String sql = "select * from hr.employees";
		
		List<Employee> list = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
				Employee emp = map(rs);
				list.add(emp);
			}	
		}
		return list;
	}
	
/*	public List<Employee> findByName(String name) throws Exception{
		
		name = name.replace("'", "''");
		name = name.toLowerCase();
		String sql = "select * from hr.employees " +
								 "where lower(last_name) like '%"+name+"%'";
		System.out.println(sql);
		
		List<Employee> list = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
				Employee emp = map(rs);
				list.add(emp);
			}
		}
		return list;
	}
	*/
	
public List<Employee> findByName(String name) throws Exception{
		
		name = "%" + name.toLowerCase() + "%";
		String sql = "select * from hr.employees " +
								 "where lower(last_name) like ?";
		System.out.println(sql);
		
		List<Employee> list = new ArrayList<>();
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, name);
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					Employee emp = map(rs);
					list.add(emp);
				
				}
			}
		}
		return list;
}
	
	
	
	private Employee map(ResultSet rs) throws Exception{
		return Employee.builder()
				.employeeId(rs.getLong("employee_id"))
				.firstName(rs.getString("first_name"))
				.lastName(rs.getString("last_name"))
				.email(rs.getString("email"))
				.phoneNumber(rs.getString("phone_number"))
				.hireDate(rs.getDate("hire_date"))
				.jobId(rs.getString("job_id"))
				.salary(rs.getDouble("salary"))
				.commissionPct(rs.getDouble("commission_pct"))
				.managerId(rs.getLong("manager_id"))
				.departmentId(rs.getLong("department_id"))
				.build();
		
	}
}
