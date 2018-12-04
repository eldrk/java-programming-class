package edu.iot.sagittarius2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import edu.common.dao.PaginationDaoImpl;
import edu.iot.common.database.Session;
import edu.iot.sagittarius2.model.Gallery;

public class GalleryDaoImpl extends PaginationDaoImpl<Gallery, Long> 
														implements GalleryDao {

	public GalleryDaoImpl() {
		super("GalleryDao");
	}

	@Override
	public List<Gallery> random(int num) throws Exception {
		try (SqlSession session = Session.getSession()){
			return session.selectList(namespace + ".random",num);
			
		}
	}

	



}
