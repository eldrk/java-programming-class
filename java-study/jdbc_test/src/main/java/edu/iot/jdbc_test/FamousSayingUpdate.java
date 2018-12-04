package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.command.Prompt;
import edu.iot.jdbc_test.dao.FamousSayingDaoImpl;
import edu.iot.jdbc_test.model.FamousSaying;

public class FamousSayingUpdate {

	public static void main(String[] args) {
		FamousSayingDaoImpl dao = new FamousSayingDaoImpl();
		try {
			List<FamousSaying> list = dao.getList();
			for(FamousSaying s : list) {
				System.out.println(s);
			}
			
			int count = dao.count();
			System.out.printf("총%d건\n",count);
			
			//ID로 검색하기
			Prompt prompt = new Prompt();
			long id = prompt.getInt("수정할 ID");
			FamousSaying fs = dao.findById(id);
			System.out.println(fs);
			
			//수정할 내용 입력받아 반영 비어있으면 그대로두겠다
			String statement = prompt.getString("내용").trim();
			if(!statement.isEmpty()) {
				fs.setStatement(statement);
			}
			String who = prompt.getString("출처").trim();
			if(!who.isEmpty()) {
				fs.setWho(who);
			}
			
			//dao로 수정
			dao.update(fs);
			
			//수정내용확인
			fs = dao.findById(fs.getId());
			System.out.println(fs);
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}

}
