package edu.iot.part3.chapter15_20180807;

import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Authentication auth = new Authentication();
		
		Prompt prompt = new Prompt();
		User user = null;
		int i;
		for(i=0;i<3;i++){
			System.out.println("아이디와 비밀번호를 입력해주세요 ");
			String id = prompt.getString("아이디");
			String password = prompt.getString("비밀번호");
			System.out.println();
			
			try {
				user = auth.login(id, password);
				break;
			} catch (LoginFailException e) {
				System.out.println(e.getMessage());				
			}
		
		}
		
		if(user != null) {
			String message = String.format("%s(%s)님이 로그인했습니다.", 
					user.getUserId(),user.getName());
			System.out.println(message);
		}else {
			System.out.println("로그인 실패");
		}
		
	
		
	}
}
