package edu.iot.sagittarius;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.iot.common.sec.SHA256Util;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class ChangePasswordAllEx {

	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		try {
			List<Member> list = dao.getList();
			for(Member m : list) {
				changePassword(dao,m);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void changePassword(MemberDao dao, Member m) throws Exception{
		String userId = m.getUserId();
		String password = m.getPassword();
		String salt = SHA256Util.generateSalt();
		String encPassword = SHA256Util.getEncrypt(password, salt);
		
		Map<String,String>map = new HashMap<>();
		map.put("userId", userId);
		map.put("oldPassword",password);
		map.put("newPassword", encPassword);
		map.put("salt", salt);
		int result = dao.changePassword(map);
		
		if(result ==1) {
			System.out.println(userId + "비밀번호 변경완료");
		}else {
			System.out.println("사용자 ID 또는 비밀번호가 일치하지 않습니다.");
		}
		
		
	}

}
