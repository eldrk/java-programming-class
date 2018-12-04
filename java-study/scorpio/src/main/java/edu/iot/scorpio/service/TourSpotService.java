package edu.iot.scorpio.service;

import java.util.List;

import edu.iot.scorpio.model.TourSpot;

public interface TourSpotService {
	List<TourSpot> getList();
	List<String> getRegionList();
	
	TourSpot findByID(int id);
	List<TourSpot> findRegion(String region);
}
