package edu.iot.sagittarius;



import java.util.HashMap;
import java.util.Map;

import edu.iot.common.command.Prompt;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class LoginEx2 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		Prompt prompt = new Prompt();
		
		try {
			String userId = prompt.getString("사용자 ID").trim();
			String oldPassword = prompt.getString("현재비밀번호").trim();
			String newPassword = prompt.getString("새 비밀번호").trim();
			String newPassword2 = prompt.getString("새 비밀번호확인").trim();
		
		  	if(newPassword.equals(newPassword2)) {
		  		Map<String, String> map = new HashMap<>();
		  		map.put("userId", userId);
		  		map.put("oldPassword", oldPassword);
		  		map.put("newPassword", newPassword);
		  		int result = dao.changePassword(map);
		  		
		  		if(result ==1) {
		  			System.out.println("비밀번호 변경 완료");
		  		}else {
		  			System.out.println("사용자 ID또는 비밀번호가 일치하지 않습니다");
		  		}
		  		
		  	}else {
		  		System.out.println("새 비밀번호가 일치하지 않습니다.");
		  	}

		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
