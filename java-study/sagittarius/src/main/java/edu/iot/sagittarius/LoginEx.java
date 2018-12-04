package edu.iot.sagittarius;

import edu.iot.common.command.Prompt;
import edu.iot.common.sec.SHA256Util;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class LoginEx {

	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		Prompt prompt = new Prompt();
		try {
			String userId = prompt.getString("사용자 ID").trim();
			String password = prompt.getString("비밀번호").trim();
			
			Member m = dao.findById(userId);
			if(m != null) { //입력한 userId가 있는 경우
				String salt = m.getSalt();
				String enPassword =SHA256Util.getEncrypt(password, salt);
				
				if(m.getPassword().equals(enPassword)) {
					System.out.println("로그인 성공");
					System.out.println("사용자 레벨 : " +m.getUserLevel());
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println(userId + "는 존재하지 않습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
