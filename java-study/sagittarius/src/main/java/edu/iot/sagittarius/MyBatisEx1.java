package edu.iot.sagittarius;

import java.util.List;

import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class MyBatisEx1 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		try {
			int count = dao.count();
			System.out.println("데이터 건수 : " + count);
			List<Member> list = dao.getList();
			
			list.forEach(System.out::println);
			

//			Member m = dao.findById("ing");
//			System.out.println(m);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
