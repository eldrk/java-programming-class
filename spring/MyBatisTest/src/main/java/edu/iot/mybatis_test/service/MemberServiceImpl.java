package edu.iot.mybatis_test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iot.common.exception.LoginFailException;
import edu.iot.common.sec.SHA256Util;
import edu.iot.mybatis_test.dao.MemberDao;
import edu.iot.mybatis_test.model.Member;
import edu.iot.mybatis_test.model.Pagination;
import edu.iot.mybatis_test.model.Search;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao dao;


	@Override
	public Member login(String userId, String password) throws Exception {
		Member member = dao.findById(userId);
		if(member == null) {
			throw new LoginFailException("사용자 ID가 존재하지 않습니다.");
		}else {
			String enPassword = SHA256Util.getEncrypt(password,member.getSalt());
			if(enPassword.equals(member.getPassword())) {
				return member;
			}else {
				throw new LoginFailException("비밀번호가 일치하지 않습니다.");
			}
		}
	}

	@Override
	public void join(Member member) throws Exception {
		String salt = SHA256Util.generateSalt();
		String enPassword = SHA256Util.getEncrypt(member.getPassword(),salt);
		
		member.setSalt(salt);
		member.setPassword(enPassword);
		
		dao.insert(member);

	}

	@Override
	public String idcheck(String userId) throws Exception {
		Member member = dao.findById(userId);
		if(member == null) { //ID중복아님
			return "ok";
		}
		//ID중복
		return "fail";
	}

	@Override
	public Map<String, Object> getPage(int page) throws Exception {
		
		Map<String, Object> map = new HashMap<>();
		
		int total = 1000; //dao.getCount();
		Pagination pagination = new Pagination(page,total);
		map.put("pagination", pagination);
		map.put("list", dao.getPage(pagination.getPageMap()));
		return map;
		
		/*int total = dao.count();
		int totalPage= (int)Math.ceil(total/10.);
		
		map.put("page", page);
		map.put("total", total);
		map.put("totalPage", totalPage);
		
		int start = (page-1)*10+1;
		int end   = start +9;
		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("start", start);
		pageMap.put("end", end);
		
		map.put("list", dao.getPage(pageMap));
		
		return map;*/
	}

	@Override
	public Member findById(String userId) throws Exception {
		
		return dao.findById(userId);
	}

	@Override
	public void delete(String userId) throws Exception {
		dao.delete(userId);
		
	}

	@Override
	public int update(Member member, Member sMember) throws Exception {
		
		String salt = sMember.getSalt();
		String enPassword = SHA256Util.getEncrypt(member.getPassword(), salt);
		member.setPassword(enPassword);
		return dao.update(member);
	}

	@Override
	public int chagePassword(Member member, String oldPassword, String newPassword) throws Exception {
		Map<String,String> map = new HashMap<>();
		String salt = member.getSalt();
		String enOldPassword = SHA256Util.getEncrypt(oldPassword, salt);
		String enNewPassword = SHA256Util.getEncrypt(newPassword, salt);
		
		map.put("userId", member.getUserId());
		map.put("oldPassword",enOldPassword);
		map.put("newPassword", enNewPassword);
		return dao.changePassword(map);
	}

	@Override
	public int updateByAdmin(Member member) throws Exception {
		return dao.updateByAdmin(member);
	}

	@Override
	public List<Member> search(Search search) throws Exception {
		return dao.search(search);
	}

}
