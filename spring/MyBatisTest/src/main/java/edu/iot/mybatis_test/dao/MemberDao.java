package edu.iot.mybatis_test.dao;

import java.util.List;
import java.util.Map;

import edu.iot.common.dao.CrudDao;
import edu.iot.mybatis_test.model.Member;
import edu.iot.mybatis_test.model.Search;

public interface MemberDao extends CrudDao<Member, String> {

	int changePassword(Map<String, String> map) throws Exception;

	int updateByAdmin(Member member) throws Exception;
	
	List<Member> search(Search search) throws Exception;

}
