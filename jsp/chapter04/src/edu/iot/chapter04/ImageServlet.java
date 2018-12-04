package edu.iot.chapter04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class ImageServlet
 */
@WebServlet("/image")
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("id") + ".jpg";
		String path = request.getServletContext()
							 .getRealPath("/images/" +fileName);
		

		File file = new File(path);
		if(!new File(path).exists()) {
			response.sendError(404, fileName + "File Not Found");
			return;
		}
		//브라우저에 전달할 내용 설정 - Mimetype, 길이설정
		response.setContentType("image/jpeg");
		response.addHeader("Content-Length","" +file.length());
		
		//브라우저와 연결된 OutputStream얻기
		//참고 : 문자 출력시에는 response.getWriter()
		//      바이트(바이너리) 출력시 response.getOutputStream()
		try(
			BufferedInputStream in = new BufferedInputStream(
					new FileInputStream(file));
			BufferedOutputStream out = new BufferedOutputStream(
					response.getOutputStream());
		){
			int data;
			while((data=in.read()) != -1) {
				out.write(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
