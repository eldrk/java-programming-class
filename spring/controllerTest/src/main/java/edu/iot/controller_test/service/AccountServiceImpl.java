package edu.iot.controller_test.service;

import org.springframework.stereotype.Service;

import edu.iot.controller_test.exception.LoginFailException;
import edu.iot.controller_test.model.Member;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public void login(Member member) throws LoginFailException {
		if(!"woosung".equals(member.getUserId())) {
			throw new LoginFailException("사용자 ID가 일치하지 않습니다.");
		}
		if(!"1234".equals(member.getPassword())) {
			throw new LoginFailException("비밀번호가 일치하지 않습니다.");
		}

	}

}
