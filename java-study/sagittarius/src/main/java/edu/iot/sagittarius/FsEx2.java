package edu.iot.sagittarius;

import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.sagittarius.dao.FamousSayingDao;
import edu.iot.sagittarius.dao.FamousSayingDaoImpl;
import edu.iot.sagittarius.model.FamousSaying;

public class FsEx2 {
	public static void main(String[] args) {
		FamousSayingDao dao = new FamousSayingDaoImpl();
		Prompt prompt = new Prompt();
		
		try {
			int count = dao.count();
			System.out.println("데이터 건수 : " +count);
			int totalPage = (int)Math.ceil(count/10.);
			System.out.println("페이지 : 1 ~ " +totalPage);
			
			int page = prompt.getInt("검색페이지");
			int start = (page-1)*10+1;
			int end = start+9;
			
			List<FamousSaying> list = dao.getPage(start, end);
			list.forEach(System.out::println);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
