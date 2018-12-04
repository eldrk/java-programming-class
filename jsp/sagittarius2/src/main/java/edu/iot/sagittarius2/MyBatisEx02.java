package edu.iot.sagittarius2;



import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.sagittarius2.dao.Top100Dao;
import edu.iot.sagittarius2.dao.Top100DaoImpl;
import edu.iot.sagittarius2.model.Top100;

public class MyBatisEx02 {

	public static void main(String[] args) {
		Top100Dao dao = new Top100DaoImpl();
		Prompt prompt = new Prompt();
		
		try {
			int count = dao.count();
			System.out.println("데이터 건수 :" +count);
			int totalPage = (int)Math.ceil(count/10.);
			System.out.println("페이지 : 1~ " +totalPage);
			
			int page = prompt.getInt("검색페이지");
			int start = (page-1)*10+1;
			int end = start+9;
			
			List<Top100> list = dao.getPage(start, end);
			list.forEach(System.out::println);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
