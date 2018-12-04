package edu.iot.capricorn.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import edu.iot.capricom.model.Member;
import edu.iot.oldcommon.dao.CrudDaoImpl;
import edu.iot.oldcommon.dao.PaginationDaoImpl;
import edu.iot.oldcommon.database.Session;



public class MemberDaoImpl extends CrudDaoImpl<Member, String> 
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

