package edu.iot.capricorn.controller.member;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricom.model.Member;
import edu.iot.capricom.model.ModelAndView;
import edu.iot.capricom.service.MemberService;
import edu.iot.capricorn.Context;
import edu.iot.capricorn.controll.BasicServlet;


@WebServlet("/member/change_password")
public class MemberChangePasswordServlet extends BasicServlet {
	MemberService service = Context.get(MemberService.class);
	
	@Override
	protected void get(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Member member = (Member) request.getSession().getAttribute("USER");
		mav.addAttribute("member",member);
		mav.setView("/member/change_password.jsp");
	}
	
	@Override
	protected void post(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		
		Member member = (Member) request.getSession().getAttribute("USER");
		
		int result = service.chagePassword(member,oldPassword,newPassword);
		
		if(result == 1) {
			mav.setView("redirect:view");
		}else {
			mav.addAttribute("error","비밀번호가 일치하지않습니다.");
			mav.setView("/member/change_password.jsp");
		}
		
	}
}
