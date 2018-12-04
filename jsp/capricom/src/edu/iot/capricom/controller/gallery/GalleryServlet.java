package edu.iot.capricom.controller.gallery;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.iot.capricom.model.ModelAndView;
import edu.iot.capricom.service.GalleryService;
import edu.iot.capricorn.Context;
import edu.iot.capricorn.controll.BasicServlet;

@WebServlet("/gallery")
public class GalleryServlet extends BasicServlet {
	GalleryService service = Context.get(GalleryService.class);

	@Override
	protected void get(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String path = request.getServletContext().getRealPath("/images");
		System.out.println(path);
		
		
		
		mav.addAttribute("list",service.getImages(path));
		mav.setView("/gallery/gallery.jsp");
	}
}
