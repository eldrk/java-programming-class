package edu.iot.capricom.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.iot.capricom.model.Top100;
import edu.iot.capricorn.Context;
import edu.iot.capricorn.dao.Top100Dao;

public class Top100ServiceImpl implements Top100Service {

	Top100Dao dao = Context.get(Top100Dao.class);
	
	@Override
	public List<Top100> random(int num) throws Exception {
		List<Top100> list = dao.random(num);
		
		for(Top100 item : list) {
			List<String> imageList = new ArrayList<>();
			imageList.add("1.jpg");
			imageList.add("2.jpg");
			imageList.add("3.jpg");
			imageList.add("4.jpg");
			imageList.add("5.jpg");
			imageList.add("6.jpg");
			imageList.add("7.jpg");
			imageList.add("8.jpg");
			imageList.add("9.jpg");
			imageList.add("10.jpg");
			imageList.add("11.jpg");
			imageList.add("12.jpg");
			imageList.add("13.jpg");
			imageList.add("14.jpg");
			imageList.add("15.jpg");
			imageList.add("16.jpg");
			Collections.shuffle(imageList);
			item.setImageList(imageList);
		}
		return list;
	}

}
