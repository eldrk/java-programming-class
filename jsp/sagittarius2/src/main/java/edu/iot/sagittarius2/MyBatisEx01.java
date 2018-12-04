package edu.iot.sagittarius2;

import java.util.List;

import edu.iot.sagittarius2.dao.Top100Dao;
import edu.iot.sagittarius2.dao.Top100DaoImpl;
import edu.iot.sagittarius2.model.Top100;

public class MyBatisEx01 {

	public static void main(String[] args) {
		Top100Dao dao = new Top100DaoImpl();
		try {
			//리스트 출력
			int count = dao.count();
			System.out.println("데이터 건수: " +count);
			List<Top100> list = dao.getList();
			
			list.forEach(System.out::println);
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
