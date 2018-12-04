package edu.iot.capricorn.controller.member;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.iot.capricom.model.Member;
import edu.iot.capricom.model.ModelAndView;
import edu.iot.capricom.service.MemberService;
import edu.iot.capricorn.Context;
import edu.iot.capricorn.controll.BasicServlet;
import edu.iot.capricorn.util.Property;

@WebServlet("/member/update")
public class MemberUpdateServlet extends BasicServlet {
	MemberService service = Context.get(MemberService.class);
	
	@Override
	protected void get(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Member member = (Member) request.getSession().getAttribute("USER");
		mav.addAttribute("member",member);
		mav.setView("/member/update.jsp");
	}
	
	@Override
	protected void post(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		
		Member member = Property.parse(request, Member.class);
		Member sMember = (Member) session.getAttribute("USER");
		
		
		int result = service.update(member,sMember);
		if(result ==1) { //수정성공
			member = service.findById(member.getUserId());
			session.setAttribute("USER",member);
			mav.setView("redirect:view");
		}else { //수정실패
			mav.addAttribute("error","비밀번호가 일치하지 않습니다.");
			mav.addAttribute("member",member);
			mav.setView("/member/update.jsp");
		}
		

	}
}
