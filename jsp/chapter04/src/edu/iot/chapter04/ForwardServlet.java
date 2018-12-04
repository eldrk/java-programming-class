package edu.iot.chapter04;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("forward_form.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int age=Integer.parseInt(request.getParameter("age"));
		
		if(age>19) {
			String url=String.format("forward_result.jsp?name=%s&age=%d", 
					URLEncoder.encode("머지", "UTF-8"),age);
			response.sendRedirect(url);
//		if(age>19) {
//			request.setAttribute("name", "머지");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("forward_result.jsp");
//			dispatcher.forward(request, response);
		}else {
			request.setAttribute("error", "미성년자 출입금지");
			doGet(request, response);
		}
		
	}

}
