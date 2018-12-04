package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class FamousSayingRead {

	public static void main(String[] args) {
		FamousSayingDaoImpl dao = new FamousSayingDaoImpl();
		try {
			List<FamousSaying> list = dao.getList();
			for(FamousSaying s : list) {
				System.out.println(s);
			}
			
			int count = dao.count();
			System.out.printf("총%d건\n",count);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Database.close();
		
		
		Prompt prompt = new Prompt();
		long id = prompt.getInt("id");
		try {
			FamousSaying fs = dao.findById(id);
			System.out.println(fs);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
