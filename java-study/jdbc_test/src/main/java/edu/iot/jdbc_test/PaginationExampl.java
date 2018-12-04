package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDao;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class PaginationExampl {
	public static void main(String[] args) {
		
	FamousSayingDao dao = new FamousSayingDaoImpl();
	
	try {
		int count = dao.count();
		int totalPage = (int)Math.ceil(count/10.);
		System.out.println("페이지 : 1 ~ " +totalPage);
		
		Prompt prompt = new Prompt();
		int page = prompt.getInt("검색페이지");
		int start = (page-1)*10+1;
		int end = start + 9;
		
		List<FamousSaying> list = dao.getPage(start, end);
		for(FamousSaying fs:list) {
			System.out.println(fs);
		}
		//list출력
		//list.forEach(System.out::println);
//		list.forEach(new Consumer<FamousSaying>() {
//
//			@Override
//			public void accept(FamousSaying t) {
//				System.out.println(t);
//			}
//		});
		//list.forEach(t ->System.out.println(t));
	}catch(Exception e) {
		e.printStackTrace();
	}
	Database.close();
}
}
