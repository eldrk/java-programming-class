package edu.iot.scorpio.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.iot.scorpio.model.TourSpot;

public class TourSpotServiceTest {
	TourSpotService service;
	
	@Before//test이노테이션 전에 항상 실행된다
	public void setup() {
		service = TourSpotServiceImpl.getInstance();
	}
	
	@Test
	public void testLoad() throws Exception {
		List<TourSpot> list = service.getList();
		assertTrue(list.size() > 0);
		
		List<String> regionList = service.getRegionList();
		assertTrue(regionList.size() >0 );
		}
	}
