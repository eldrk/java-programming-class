package edu.iot.capricorn;

import java.util.HashMap;
import java.util.Map;

import edu.iot.capricom.service.GalleryService;
import edu.iot.capricom.service.GalleryServiceImpl;
import edu.iot.capricom.service.MemberService;
import edu.iot.capricom.service.MemberServiceImpl;
import edu.iot.capricom.service.Top100Service;
import edu.iot.capricom.service.Top100ServiceImpl;
import edu.iot.capricorn.dao.MemberDao;
import edu.iot.capricorn.dao.MemberDaoImpl;
import edu.iot.capricorn.dao.Top100Dao;
import edu.iot.capricorn.dao.Top100DaoImpl;

public class Context {
	static private Map<Class, Object> map;
	
	static {
		map = new HashMap<>();
		map.put(MemberDao.class, new MemberDaoImpl());
		map.put(MemberService.class, new MemberServiceImpl());
		map.put(GalleryService.class, new GalleryServiceImpl());
		map.put(Top100Dao.class, new Top100DaoImpl());
		map.put(Top100Service.class, new Top100ServiceImpl());
	}
	
	static public <T> T get(Class<T> clazz) {
		Object obj = map.get(clazz);
		return clazz.cast(obj);
	}
	
}
