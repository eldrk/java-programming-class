package edu.iot.mybatis_test.service;

import java.util.List;
import java.util.Map;

import edu.iot.mybatis_test.model.Member;
import edu.iot.mybatis_test.model.Search;

public interface MemberService {
	
	Member login(String userId, String password) throws Exception;
	
	void join(Member member) throws Exception;
	
	String idcheck(String userId) throws Exception;

	Map<String, Object> getPage(int page) throws Exception;

	Member findById(String userId) throws Exception;
	
	void delete(String userId) throws Exception;

	int update(Member member, Member sMember) throws Exception;

	int chagePassword(Member member, String oldPassword, String newPassword) throws Exception;
	
	int updateByAdmin(Member member) throws Exception;
	
	List<Member> search(Search search) throws Exception;
}
