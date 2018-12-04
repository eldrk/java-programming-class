package edu.iot.sagittarius.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import edu.common.dao.PaginationDaoImpl;
import edu.iot.common.database.Session;
import edu.iot.sagittarius.model.FamousSaying;

public class FamousSayingDaoImpl 
									extends PaginationDaoImpl<FamousSaying, Long>
									implements FamousSayingDao {
	
	public FamousSayingDaoImpl() {
		super("FamousSayingDao");
	}

	@Override
	public List<FamousSaying> random(int num) throws Exception {
		try(SqlSession session = Session.getSession()){
			return session.selectList(namespace +".random",num);
			
		}
	}


}
