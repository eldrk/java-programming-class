package edu.iot.part3.chapter18_20180810;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static List<String> readLines(File file){
		List<String> list = new ArrayList<>();

		try (
				BufferedReader br = new BufferedReader(new FileReader(file));
		 ){ 
			// 라인별 읽기, 출력하기
			String linestring;
			while ((linestring = br.readLine()) != null) {
				System.out.println(linestring);
				list.add(linestring);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
