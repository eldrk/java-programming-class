package edu.iot.capricom.service;

import java.util.Map;

import edu.iot.capricom.model.Member;

public interface MemberService {
	
	Member login(String userId, String password) throws Exception;
	
	void join(Member member) throws Exception;
	
	String idcheck(String userId) throws Exception;

	Map<String, Object> getPage(int page) throws Exception;

	Member findById(String userId) throws Exception;
	
	void delete(String userId) throws Exception;

	int update(Member member, Member sMember) throws Exception;

	int chagePassword(Member member, String oldPassword, String newPassword) throws Exception;
	
}
