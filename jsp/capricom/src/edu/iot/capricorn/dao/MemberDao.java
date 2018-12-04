package edu.iot.capricorn.dao;

import java.util.Map;

import edu.iot.capricom.model.Member;
import edu.iot.common.dao.CrudDao;

public interface MemberDao extends CrudDao<Member, String>{
	
	int changePassword(Map<String, String> map) throws Exception;
}
