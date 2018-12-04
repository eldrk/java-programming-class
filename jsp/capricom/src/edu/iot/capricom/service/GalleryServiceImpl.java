package edu.iot.capricom.service;

import java.io.File;
import java.io.FilenameFilter;

public class GalleryServiceImpl implements GalleryService {
	


	@Override
	public String[] getImages(String path) throws Exception {
		
		File dir = new File(path);
		return dir.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				name = name.toLowerCase();
				return name.endsWith(".jpg");
			}
		});

	}

}
