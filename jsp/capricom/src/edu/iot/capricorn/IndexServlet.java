package edu.iot.capricorn;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricom.model.ModelAndView;
import edu.iot.capricom.service.Top100Service;
import edu.iot.capricorn.controll.BasicServlet;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends BasicServlet {
	Top100Service service = Context.get(Top100Service.class);
	
	@Override
	protected void get(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		mav.addAttribute("list",service.random(4)); //인기순
		mav.addAttribute("list2",service.random(6)); //랜덤
		mav.setView("/index.jsp");
	}
}
