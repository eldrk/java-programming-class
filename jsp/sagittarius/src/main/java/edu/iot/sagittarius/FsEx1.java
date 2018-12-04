package edu.iot.sagittarius;

import java.util.List;

import edu.iot.sagittarius.dao.FamousSayingDao;
import edu.iot.sagittarius.dao.FamousSayingDaoImpl;
import edu.iot.sagittarius.model.FamousSaying;

public class FsEx1 {
	public static void main(String[] args) {
		FamousSayingDao dao = new FamousSayingDaoImpl();
		try {
			int count = dao.count();
			System.out.println("데이터 건수 : " +count);
			
			List<FamousSaying> list = dao.getList();
			list.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
