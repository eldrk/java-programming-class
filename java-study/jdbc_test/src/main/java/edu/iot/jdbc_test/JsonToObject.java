package edu.iot.jdbc_test;

import com.google.gson.Gson;

import edu.iot.common.util.FileUtil;
import edu.iot.jdbc_test.model.FamousSaying;

public class JsonToObject {
	public static void main(String[] args) {
		try {
			//절대경로로 설정하여 읽어들임
			String json = FileUtil.readResource("/famoussaying2.json");
			
			Gson gson = new Gson();
			
			//단일 객체 복원
			FamousSaying fs = gson.fromJson(json, FamousSaying.class);
			
			System.out.println(fs);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
