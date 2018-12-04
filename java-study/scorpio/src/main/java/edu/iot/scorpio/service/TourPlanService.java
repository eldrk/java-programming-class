package edu.iot.scorpio.service;

import java.util.Date;

import edu.iot.scorpio.model.TourPlan;

public interface TourPlanService {
	
	boolean isFirst();    //처음 저장하는가?
	boolean isDitry();	//수정된 적이 있는가?
	
	TourPlan getPlan();
	
	
	void newPlan(String title ,Date begin, Date end, String description);
	void load(String fname) throws Exception;
	void save(String fname) throws Exception;
	void save() throws Exception;
	void addSchedule(Date date, int spotId);
	void deleteSchedule(int ix);
	

}
