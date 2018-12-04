package edu.iot.scorpio.command;

import java.io.IOException;
import java.util.List;

import edu.iot.common.command.Command;
import edu.iot.common.command.Prompt;
import edu.iot.scorpio.model.TourSpot;
import edu.iot.scorpio.service.TourSpotService;
import edu.iot.scorpio.service.TourSpotServiceImpl;

public class RegionCommand implements Command {
	
	TourSpotService service = TourSpotServiceImpl.getInstance();

	@Override
	public void execute() throws Exception {
		//권역 리스트 얻기
		List<String> list = service.getRegionList();
		//권역 선택
		Prompt prompt = new Prompt();
		int ix = prompt.selectList("권역선택", list);
		String region = list.get(ix);
		
		//권역 TourSpot리스트 얻기
		List<TourSpot> spotList = service.findRegion(region);
		System.out.printf("\n%s (%d건) ================================\n", region,spotList.size());
		for(TourSpot spot : spotList) {
			System.out.printf("%3d] %s\t%s\n", spot.getId(),spot.getName(),spot.getAddress());
		}
		System.out.println("===========================================");

		while(true) {
			String select = prompt.getString("숫자/q");
			if(select.equals("q")) {
				return;
			}else {
				int id = Integer.parseInt(select);
				viewHotSpot(id);
			}
			
		}
		
		
	}
	
	public void viewHotSpot(int id) {
		Prompt prompt = new Prompt();
		TourSpot spot = service.findByID(id);
		
		if(spot == null) {
			System.out.println("해당사항이 없습니다.");
			return;
		}
		System.out.println(spot.getId());
		System.out.println(spot.getName());
		System.out.println(spot.getRegion() + ", " + spot.getLocation());
		System.out.println(spot.getAddress());
		System.out.println(spot.getContent());
		System.out.println(spot.getHomePage());
		
		String visit = prompt.getString("홈페이지 방문 여부(y/n)");
		if(visit.equals("y")) {//홈페이지 방문
			try {
				new ProcessBuilder("cmd","/c","start",spot.getHomePage()).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		prompt.getString("END");//바로목록보기방지
		
	}
	}


