package edu.iot.jdbc_test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.iot.jdbc_test.dao.EmployeeTempDao;
import edu.iot.jdbc_test.model.Employee;

public class EmployeeDaoTest {
	EmployeeTempDao dao;
	
	@Before
	public void setup() {
		dao = new EmployeeTempDao();
	}
	
	@Test
	public void testCount() throws Exception{
		int count = dao.count();
		assertTrue(count == 107);
	}
	
	@Test
	public void testfindById() throws Exception{
		Employee emp ;
		emp = dao.findById(100);
		System.out.println(emp);
		assertTrue(emp.getEmployeeId() == 100);
		
		emp = dao.findById(1000);
		assertTrue(emp == null);
	}
	
	@Test
	public void getList() throws Exception {
		List<Employee> list =dao.getList();
		System.out.println(list);
		assertTrue(list.size() == 107);
	}
	
	@Test
	public void testFindByName() throws Exception {
		List<Employee> list = dao.findByName("ing");
		System.out.println(list.size());
	}
	
}
