package edu.iot.scorpio.command;

import java.io.IOException;
import java.util.List;


import edu.iot.common.command.Command;
import edu.iot.common.command.Prompt;
import edu.iot.common.ui.Pagination;
import edu.iot.scorpio.model.TourSpot;
import edu.iot.scorpio.service.TourSpotService;
import edu.iot.scorpio.service.TourSpotServiceImpl;


public class Top100Command implements Command {
	
	TourSpotService service = TourSpotServiceImpl.getInstance();

	@Override
	public void execute() throws Exception {
		List<TourSpot>list = service.getList();
		Pagination<TourSpot> pagination = new Pagination<>(list);
		
		int page = 1;
		while(true) {
			List<TourSpot> pageList = pagination.getPage(page);
			for(TourSpot spot : pageList) {
				System.out.printf("%3d] %s\t%s\n", spot.getId(),spot.getName(),spot.getRegion());
			}
			pagination.printPages();
			
			Prompt prompt = new Prompt();
			String select = prompt.getString("p/n/v/숫자/q");
			if(select.equals("p")) {
				page = pagination.previous();
			}else if(select.equals("n")) {
				page = pagination.next();
			}else if(select.equals("v")) {//상세보기
				viewHotSpot();
			}else if(select.equals("q")) {
				break;
			}else {
				page = Integer.parseInt(select);
			}
			System.out.println();
		}
		
	}
	
	public void viewHotSpot() {
		Prompt prompt = new Prompt();
		int id = prompt.getInt("ID ");
		TourSpot spot =  service.findByID(id);
		
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
