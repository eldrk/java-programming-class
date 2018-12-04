package edu.iot.sagittarius.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import edu.common.dao.PaginationDaoImpl;
import edu.iot.common.database.Session;
import edu.iot.sagittarius.model.Member;



public class MemberDaoImpl extends PaginationDaoImpl<Member, String> 
													 implements MemberDao {

	public MemberDaoImpl() {
		super("MemberDao");
	}

	@Override
	public int changePassword(Map<String, String> map) throws Exception {
		try(SqlSession session = Session.getSession()){
			int count = session.update(namespace + ".changePassword",map);
			session.commit();
			return count;
		}
	}


}

