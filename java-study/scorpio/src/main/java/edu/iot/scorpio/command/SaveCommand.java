package edu.iot.scorpio.command;

import edu.iot.common.command.Command;
import edu.iot.common.command.Prompt;
import edu.iot.scorpio.service.TourPlanService;
import edu.iot.scorpio.service.TourPlanServiceImpl;

public class SaveCommand implements Command {
	
	TourPlanService service = TourPlanServiceImpl.getInstance();

	@Override
	public void execute() throws Exception {
		if(service.isFirst()) {//처음 저장하는 경우
			System.out.println("기존 계획을 먼저 저장해야합니다.");
			Prompt prompt = new Prompt();
			
			String defaultName = service.getPlan().getTitle();
			String fname = prompt.getString("파일명(" + defaultName + ")");
			if(fname.equals("")) {//엔터만 친 경우
				fname = defaultName;
			}
			String path = "c:/temp/" + fname + ".tsc";
			
			service.save(path);
		}else { //다시 저장하는 경우
			service.save();
		}
		
		System.out.println("저장하였습니다.");//throws로 예외를 던지므로 여기까지 수행된것은 true이다
		
	}
	

}
