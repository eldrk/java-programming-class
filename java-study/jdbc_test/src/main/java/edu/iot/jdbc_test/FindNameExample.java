package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.jdbc_test.dao.EmployeeTempDao;
import edu.iot.jdbc_test.model.Employee;

public class FindNameExample {

	public static void main(String[] args){
		Prompt prompt = new Prompt();
		String name = prompt.getString("이름");
		
		EmployeeTempDao dao = new EmployeeTempDao();
		try {
			int total = dao.count();
			List<Employee> list = dao.findByName(name);
			
			
			System.out.printf("검색어 : %s\n" , name);
			System.out.printf("결과 : %d 건 / 총 %d건 \n",
												list.size(),total);
			
			for(Employee emp : list) {
				System.out.println(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Database.close();
	}

}
