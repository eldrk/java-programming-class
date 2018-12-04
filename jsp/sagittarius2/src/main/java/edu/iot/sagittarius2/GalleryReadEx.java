package edu.iot.sagittarius2;

import java.io.File;

import edu.iot.common.util.FileUtil;
import edu.iot.sagittarius2.dao.GalleryDao;
import edu.iot.sagittarius2.dao.GalleryDaoImpl;
import edu.iot.sagittarius2.model.Gallery;

public class GalleryReadEx {

	public static void main(String[] args) {
		
		try {
			GalleryDao dao = new GalleryDaoImpl();
			Gallery g = dao.findById(1L);
			System.out.println(g);
			
			File dir = new File("c:/temp/download");
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			File imageFile = new File(dir,g.getFileName());
			FileUtil.save(imageFile, g.getImage());
			
			File thumbFile = new File(dir,"thumb_"+g.getFileName());
			FileUtil.save(thumbFile, g.getImage());
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
