package edu.iot.sagittarius2;

import com.google.gson.Gson;

import edu.iot.common.util.FileUtil;
import edu.iot.sagittarius2.dao.Top100Dao;
import edu.iot.sagittarius2.dao.Top100DaoImpl;
import edu.iot.sagittarius2.model.Top100;

public class Top100AllSave {

	public static void main(String[] args) {
		try{
			String json = FileUtil.readResource("/top100.json");
			Gson gson = new Gson();
			
			//배열로 복원하기
			Top100[] arr = gson.fromJson(json, Top100[].class);
			Top100Dao dao = new Top100DaoImpl();
			for(Top100 s : arr) {
				dao.insert(s);
			}
			
			System.out.println("저장완료");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
