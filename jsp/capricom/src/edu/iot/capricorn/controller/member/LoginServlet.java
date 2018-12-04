package edu.iot.capricorn.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricom.model.Member;
import edu.iot.capricom.service.MemberService;
import edu.iot.capricorn.Context;
import edu.iot.common.sec.SHA256Util;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	//MemberDao dao = new MemberDaoImpl();
	MemberService service = Context.get(MemberService.class);
 
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String destination = request.getParameter("destination");
		
		try {
				Member member = service.login(userId, password);
				request.getSession().setAttribute("USER", member);
				
				if(destination.isEmpty()) {
					String url = request.getContextPath()+"/index";
					response.sendRedirect(url);
					
				}else {
					response.sendRedirect(destination);
				}
				
		} catch (Exception e) {
				request.setAttribute("error", e.getMessage());
				request.setAttribute("userId", userId);
				request.setAttribute("destination", destination);
				doGet(request,response);
		}
		
		
		
	}

}
