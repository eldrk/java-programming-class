package edu.iot.capricorn;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricom.model.Member;
import edu.iot.capricom.service.MemberService;
import edu.iot.common.sec.SHA256Util;


@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
		//MemberDao dao = new MemberDaoImpl();
		MemberService service = Context.get(MemberService.class);
   
    public JoinServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/account/join.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = map(request);
		
		try {
			service.join(member);
			//로그인 페이지로 redirect
			String url = request.getContextPath() +"/login";
			response.sendRedirect(url);
		
		}catch(Exception e) {
			//join.jsp로 forward
			request.setAttribute("errer", "저장실패");
			request.setAttribute("member", member);
			doGet(request,response);
		}
		
	}
	
	private Member map(HttpServletRequest request) {
			return Member.builder()
									 .userId(request.getParameter("userId"))
									 .password(request.getParameter("password"))
									 .name(request.getParameter("name"))
									 .phoneNumber(request.getParameter("phoneNumber"))
									 .nickName(request.getParameter("nickName"))
									 .email(request.getParameter("email"))
									 .address(request.getParameter("address"))
									 .build();
	}

}
