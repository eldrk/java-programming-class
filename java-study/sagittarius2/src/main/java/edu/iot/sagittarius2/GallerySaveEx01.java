package edu.iot.sagittarius2;

import java.io.File;

import edu.iot.common.util.FileUtil;
import edu.iot.sagittarius2.dao.GalleryDao;
import edu.iot.sagittarius2.dao.GalleryDaoImpl;
import edu.iot.sagittarius2.model.Gallery;

public class GallerySaveEx01 {

	public static void main(String[] args) {
		File file = new File("c:/temp/Penguins.jpg");
		
		try {
			byte[] data = FileUtil.bytes(file);
			String fname = file.getName();
			String title = fname.substring(0, fname.lastIndexOf("."));
			
			Gallery g = Gallery.builder()
												 .title(title)
												 .description(title)
												 .fileName(fname)
												 .fileSize(file.length())
												 .image(data)
												 .thumb(data)
												 .build();
			System.out.println(g);
			GalleryDao dao = new GalleryDaoImpl();
			dao.insert(g);
			System.out.println("저장완료");
		} catch (Exception e) {

			e.printStackTrace();
		}
		

	}

}
