package edu.iot.common.util;

import java.io.File;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	public static void saveThumb(File src) throws Exception{ 
		File thumb = new File(src.getParent() + "/thumb", 
							  src.getName()); 
		
		// Thumbnail 파일 생성 
		Thumbnails 
			.of(src)  //원본지정
			.crop(Positions.CENTER) // 이미지 crop 위치
			.size(200, 200) 
			.toFile(thumb); 
	}
}
