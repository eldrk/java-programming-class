package edu.iot.scorpio.command;

import java.io.File;

import edu.iot.common.command.Command;
import edu.iot.common.util.FileSelect;
import edu.iot.scorpio.service.TourPlanService;
import edu.iot.scorpio.service.TourPlanServiceImpl;

public class LoadCommand implements Command {
	TourPlanService service = TourPlanServiceImpl.getInstance();

	@Override
	public void execute() throws Exception {
		//더티체크
		if(service.isDitry()) {
			Command saveCommand = new SaveCommand();
			saveCommand.execute();
		}
		
		//c:/temp에서 확장자가 .tsc인 파일중 하나 선택
		FileSelect fselect = new FileSelect("c:/temp", ".tsc");
		File file = fselect.select();
		
		service.load(file.getPath());
		
		new PlanManageCommand().execute();

	}

}
