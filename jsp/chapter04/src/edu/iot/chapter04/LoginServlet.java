package edu.iot.chapter04;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //form관련포워드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("login_form.jsp");
		dispatcher.forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//form관련 성공시 리다이렉트, 실패시 포워드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = "ㅎㅎ";
		String pwd = "1234";
		String name = "헤헤";
		
		if(id.equals(request.getParameter("userid")) &&
		   pwd.equals(request.getParameter("pwd"))){
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			String destination = request.getParameter("destination");
			if(destination.isEmpty()) {
				response.sendRedirect("main.jsp");
			}else {
				session.removeAttribute("destination");
				response.sendRedirect(destination);
			}
			
					//+ "?name="+
		   //URLEncoder.encode(name,"UTF-8"));
		}
		else{
			//response.sendRedirect("login_form.jsp");
			request.setAttribute("error", "사용자 ID 또는 비밀번호가 일치하지 않습니다.");
			doGet(request,response);
			
		}
	}

}
