package edu.iot.sagittarius;

import edu.iot.common.command.Prompt;
import edu.iot.sagittarius.dao.MemberDao;
import edu.iot.sagittarius.dao.MemberDaoImpl;
import edu.iot.sagittarius.model.Member;

public class MyBatisEx3 {

	public static void main(String[] args) {

		MemberDao dao = new MemberDaoImpl();
		Prompt prompt = new Prompt();
		try {
			String member = prompt.getString("멤버").trim();
			Member userlevel = dao.findById(member);
			if(userlevel != null) {
				//사용자로부터 변경 정보 입력
				String address = prompt.getString("주소 입력").trim();
				if(!address.isEmpty()) {
					userlevel.setAddress(address);
				}
				
				//사용자로부터 비밀번호입력
				String password = prompt.getString("비밀번호입력").trim();
				userlevel.setPassword(password);
				
				int count = dao.update(userlevel);
				if(count ==1) {
					System.out.println("수정완료");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				//System.out.printf("수정 %d 건\n",count);
			}else {
				System.out.println(member +"가 없습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
