package edu.iot.part3.chapter15_20180807;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
	Map<String, User> map ;
	
	public Authentication() {
		map = new HashMap<>();
		map.put("string", new User("spring","12","봄"));
		map.put("summer", new User("summer","123","여름"));
		map.put("fall", 	new User("fall","1234","가을"));
		map.put("winter", new User("winter","12345","겨울"));
	}
	
	public User login(String id, String password) throws LoginFailException{
				
		if(map.containsKey(id)) {
			User user = map.get(id);
			if(user.getPassword().equals(password)) {
				return user;
			}else {
				throw new LoginFailException("비밀번호가 일치하지 않습니다.");
			}
		}else {
				throw new LoginFailException("아이디가 존재하지 않습니다.");
		}
		
	}
	
		
	}

