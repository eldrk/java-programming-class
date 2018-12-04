package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class FamousSayingRandom {
	public static void main(String[] args) {
		FamousSayingDaoImpl dao = new FamousSayingDaoImpl(); 
		Prompt prompt = new Prompt();
		int num = prompt.getInt("num");
		try {
			List<FamousSaying> list = dao.random(num);
			for(FamousSaying fs : list) {
				System.out.println(fs);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
