package edu.iot.scorpio.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.iot.common.util.FileUtil;
import edu.iot.scorpio.model.TourSpot;

public class TourSpotServiceImpl implements TourSpotService {
	
	final static String FILE_PATH = "c:/temp/tour100.txt";
	
	private static TourSpotServiceImpl instance = new TourSpotServiceImpl();

	private TourSpotServiceImpl() {
		load();
	}

	public static TourSpotServiceImpl getInstance() {
		return instance;
	}
	
	List<TourSpot> list;
	List<String> regionList;
	
	private void load() {
		File file = new File(FILE_PATH);
		//List<String> list = FileUtil.readLines(file); ->utf-8ver
		List<String> spotlist = FileUtil.readLines(file,"euc-kr");
		Set<String> regionSet = new HashSet<>();
		list = new ArrayList<>();
		for(String spot : spotlist) {
			String []info = spot.split("\t");
			TourSpot ts = TourSpot.builder()
										        .id(Integer.parseInt(info[0]))
										        .name(info[1])
										        .region(info[2])
										        .location(info[3])
										        .content(info[4])
										        .address(info[5])
										        .homePage(info[6])
										        .build();
			
			list.add(ts);
			regionSet.add(ts.getRegion());
		}
		regionList = new ArrayList<>(regionSet);
		Collections.sort(regionList);
	}

	@Override
	public List<TourSpot> getList() {
		return list;
	}

	@Override
	public List<String> getRegionList() {
		return regionList;
	}

	@Override
	public TourSpot findByID(int id) {
		for(TourSpot spot : list) {
			if(id == spot.getId()) {
				return spot;
			}
		}
		return null;
	}

	@Override
	public List<TourSpot> findRegion(String region) {
		List<TourSpot> spotList = new ArrayList<>();
		for(TourSpot spot : list) {
			if(region.equals(spot.getRegion())) {
				spotList.add(spot);
			}
		}
		return spotList;
	}
	
	
	
}
