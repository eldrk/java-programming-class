package edu.iot.scorpio.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourSpotTest {
	@Test
	public void testBuild() throws Exception {
		TourSpot spot = TourSpot.builder()
				//필드가 많아 생성자로 순서맞추기어려울때 lombok build를 사용한다
														.id(1)
														.name("광화문")
														.homePage("www.kwang.go.kr")
														.address("서울시.....")
														.build();
		System.out.println(spot);
	}
}
