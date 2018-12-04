package edu.iot.capricorn.controller.member;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricom.model.ModelAndView;
import edu.iot.capricom.service.MemberService;
import edu.iot.capricorn.Context;
import edu.iot.capricorn.controll.BasicServlet;

@WebServlet("/member/view")
public class MemberViewServlet extends BasicServlet {
	MemberService service = Context.get(MemberService.class);
	
	@Override
	protected void get(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		mav.setView("/member/view.jsp");
	}
}
