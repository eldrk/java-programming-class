package edu.iot.chapter04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.chapter04.model.Member;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login2")
public class Login2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
						
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("actiontag_form.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id="ws";
		String pwd="1234";
		String name="정우성";
		
		String userID = request.getParameter("userID");
		String userPwd = request.getParameter("userPwd");
		String loginCheck = request.getParameter("loginCheck");
		
		Member member = map(request);
		if(id.equals(member.getUserID()) && pwd.equals(member.getUserPwd())) {
			member.setName(name);
			request.getSession().setAttribute("USER", member);
			
			if(member.getLoginCheck().equals("manager")) {//관리자인 경우
				response.sendRedirect("manager_main.jsp");
			}else {//일반사용자인 경우
				response.sendRedirect("user_main.jsp");	
			}
		}else {//실패한 경우
			request.setAttribute("error", "사용자 ID또는 패스워드가 일치하지않습니다.");
			request.setAttribute("member", member);
			doGet(request,response);
		}
	}
	private Member map(HttpServletRequest request) {
		return Member.builder()
								 .userID(request.getParameter("userID"))
								 .userPwd(request.getParameter("userPwd"))
								 .loginCheck(request.getParameter("loginCheck"))
								 .build();
	}

}
