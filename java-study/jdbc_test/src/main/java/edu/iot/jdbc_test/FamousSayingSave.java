package edu.iot.jdbc_test;

import com.google.gson.Gson;

import edu.iot.common.util.FileUtil;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class FamousSayingSave {
	public static void main(String[] args) {
		FamousSayingDaoImpl dao = new FamousSayingDaoImpl();
		try {
			int count = dao.count();
			System.out.printf("총 %d건\n",count);
			
			//Json배열복원
			String json = FileUtil.readResource("/famoussaying.json");
			Gson gson = new Gson();
			FamousSaying[] arr = gson.fromJson(json, FamousSaying[].class);
			
			for(FamousSaying s : arr) {
				//데이터베이스에 저장하기
				dao.insert(s);
			}
			count = dao.count();
			System.out.printf("총 %d건\n",count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		Database.close();
	}
	

	
	
}
