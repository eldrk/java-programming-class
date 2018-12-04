package edu.iot.scorpio.command;

import java.util.Date;

import edu.iot.common.command.Command;
import edu.iot.common.command.Prompt;
import edu.iot.scorpio.service.TourPlanService;
import edu.iot.scorpio.service.TourPlanServiceImpl;

public class NewPlanCommand implements Command {
	
	TourPlanService service = TourPlanServiceImpl.getInstance();
	
	

	@Override
	public void execute() throws Exception {
		// 더티 체크
		if(service.isDitry()) {
			Command saveCommand = new SaveCommand();
			saveCommand.execute();
			
		}
		
		//여행 개요 입력
		Prompt prompt = new Prompt();
		String title = prompt.getString("제목");
		Date begin = prompt.getDate("시작일");
		Date end = prompt.getDate("종료일");
		String description = prompt.getLines("내용");
		
		service.newPlan(title,begin,end,description);
		new PlanManageCommand().execute();
	}

}
