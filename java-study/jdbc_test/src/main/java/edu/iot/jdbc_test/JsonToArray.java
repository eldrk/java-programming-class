package edu.iot.jdbc_test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.iot.common.util.FileUtil;
import edu.iot.jdbc_test.model.FamousSaying;

public class JsonToArray {
	public static void main(String[] args) {
		try {
			String json = FileUtil.readResource("/famoussaying.json");
			
			Gson gson = new Gson();
			
			//Gson객체제공메소드
			Type collectionType = (new TypeToken<ArrayList<FamousSaying>>() {}).getType();
			List<FamousSaying> list = gson.fromJson(json, collectionType);
			for(FamousSaying s : list) {
				System.out.println(s);
			}
/*			//배열로 복원하기
			FamousSaying[] arr = gson.fromJson(json, FamousSaying[].class);
			
			for(FamousSaying s : arr) {
				System.out.println(s);
			}
			
			//리스트로 변환
			System.out.println("====================");
			List<FamousSaying> list = new ArrayList<FamousSaying>(
					Arrays.asList(arr));
			for(FamousSaying s : list) {
				System.out.println(s);
			}*/
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
