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

/**
 * Servlet implementation class AdminMemberViewServlet
 */
@WebServlet("/admin/member/view")
public class AdminMemberViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    MemberService service = Context.get(MemberService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminMemberViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		Member member=null;
		try {
			member = service.findById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("member",member);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/member/view.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
