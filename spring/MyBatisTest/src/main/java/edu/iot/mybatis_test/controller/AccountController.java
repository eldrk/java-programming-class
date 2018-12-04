package edu.iot.mybatis_test.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.iot.common.exception.LoginFailException;
import edu.iot.mybatis_test.model.Member;
import edu.iot.mybatis_test.service.MemberService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value="/account")
public class AccountController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public void loginForm(Member member) {
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginSubmit(Member member,HttpSession session,Model model)throws Exception{
		try {
			member = service.login(member.getUserId(), member.getPassword());
			//성공하면
			session.setAttribute("USER", member);
			return "redirect:/";
		
		}catch(LoginFailException e){
			//실패하면
			model.addAttribute("error", e.getMessage());
			return "account/login";
		}
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public void joinForm(Member member) {

	}
	
	
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String joinSubmit(@Valid Member member,
							BindingResult result) throws Exception{
		//log.info(member.toString());
		if(result.hasErrors()) { //유효성 검사 실패
			return "account/join";
		}
		
		service.join(member);
		//유효성 검사 통과
		return "redirect:/";
	}
	
	//id중복체크
	//json 자동 변환 - gson의존성추가
	@RequestMapping(value="/idcheck",method=RequestMethod.GET)
	@ResponseBody
	public String checkUserId(@RequestParam("userId") String userId) throws Exception{
		return service.idcheck(userId);
	}
	
	
	
}
