package edu.iot.sagittarius;

import edu.iot.common.sec.SHA256Util;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;
import edu.iot.sagittarius.model.UserLevel;

public class MyBatisEx2 {

	public static void main(String[] args) {
		//Admin 계정 추가
		String password = "1234";
		String salt = SHA256Util.generateSalt();
		String encPassword = SHA256Util.getEncrypt(password, salt);
		
		Member admin = Member.builder()
										.userId("admin")
										.password("1234")
										.salt("salt")
										.name("관리자")
										.userLevel(UserLevel.ADMIN)
										.phoneNumber("010-1111-1111")
										.nickName("Admin")
										.email("admin@edu.iot")
										.address("")
										.build();
		//System.out.println(admin);
		
		MemberDao dao = new MemberDaoImpl();
		try {
			int count = dao.insert(admin);
			System.out.printf("추가%d 건\n",count);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
