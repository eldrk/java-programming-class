package edu.iot.sagittarius;

import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.sagittarius.dao.FamousSayingDao;
import edu.iot.sagittarius.dao.FamousSayingDaoImpl;
import edu.iot.sagittarius.model.FamousSaying;

public class FsEx3 {
	public static void main(String[] args) {
		FamousSayingDao dao = new FamousSayingDaoImpl();
		Prompt prompt = new Prompt();
		try {
			List<FamousSaying> list = dao.random(1);
			list.forEach(System.out::println);
			for(FamousSaying fs : list) {
				System.out.println(fs);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
