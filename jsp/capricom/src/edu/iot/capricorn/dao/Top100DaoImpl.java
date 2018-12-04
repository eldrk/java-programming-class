package edu.iot.capricorn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import edu.iot.capricom.model.Top100;
import edu.iot.oldcommon.dao.CrudDaoImpl;
import edu.iot.oldcommon.database.Session;

public class Top100DaoImpl  extends CrudDaoImpl<Top100, Long>
														implements Top100Dao{

	public Top100DaoImpl() {
		super("Top100Dao");
	}

	@Override
	public List<Top100> random(int num) throws Exception {
		try (SqlSession session = Session.getSession()){
			return session.selectList(namespace +".random",num);
			
		}
	}

}
