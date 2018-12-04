package edu.iot.scorpio.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import edu.iot.common.util.FileUtil;
import edu.iot.scorpio.model.TourItem;
import edu.iot.scorpio.model.TourPlan;
import edu.iot.scorpio.model.TourSpot;
import lombok.Getter;

public class TourPlanServiceImpl implements TourPlanService {
	
	private static TourPlanServiceImpl instance = new TourPlanServiceImpl();

	private TourPlanServiceImpl() {
	}

	public static TourPlanServiceImpl getInstance() {
		return instance;
	}

	@Getter
	TourPlan plan;     //여행계획
	@Getter			
	boolean dirty;		//더티 플래그
	
	String filePath;  //저장 파일 경로

	
	@Override
	public void newPlan(String title, Date begin, Date end, String description) {
		plan = new TourPlan(title, begin, end, description);
		dirty = true; //초기값이존재
		filePath = null;
		
	}


	@Override
	public void load(String fname) throws Exception {
		filePath = fname;
		plan = (TourPlan) FileUtil.deserialize(fname);
		dirty = false;

	}

	@Override
	public void save(String fname) throws Exception {
		filePath = fname;
		FileUtil.serialize(fname, plan);
		dirty = false;
	}

	@Override
	public boolean isFirst() {
		return filePath == null;
	}

	@Override
	public boolean isDitry() {
		return false;
	}

	@Override
	public void save() throws Exception {
		FileUtil.serialize(filePath, plan);
		dirty = false;
		
	}

	@Override
	public void addSchedule(Date date, int spotId) {
		TourSpotService spotService = TourSpotServiceImpl.getInstance();
		TourSpot spot = spotService.findByID(spotId);
		//TourItem 생성
		TourItem item = new TourItem(date,spot);
		List<TourItem> tourList = plan.getTourList();
		
		//tourList 리스트에 추가
		tourList.add(item);
		
		//tourList 정렬
		Collections.sort(tourList);
		
	}

	@Override
	public void deleteSchedule(int ix) {
		List<TourItem> tourList = plan.getTourList();
		if(ix >=0 && ix <tourList.size()) {
			tourList.remove(ix);
		}
		
	}





}
