package edu.iot.capricorn.controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricom.model.Member;
import edu.iot.capricom.service.MemberService;
import edu.iot.capricorn.Context;

@WebServlet("/idcheck")
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// dao 객체 생성
	//MemberDao dao = new MemberDaoImpl();
	MemberService service= Context.get(MemberService.class);

	public IdCheckServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//	파라미터에 있는 userId 얻기
		String userId = request.getParameter("userId");
		//	member에 있는 userId와 중복이 되는지 확인
		try {
			String result = service.idcheck(userId);
			PrintWriter out = response.getWriter();
			out.print(result);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
