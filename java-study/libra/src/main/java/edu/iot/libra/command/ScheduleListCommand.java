package edu.iot.libra.command;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import edu.iot.libra.model.Schedule;
import edu.iot.libra.service.ScheduleService;
import edu.iot.libra.service.ScheduleServiceImpl;
import edu.iot.libra.ui.Prompt;

public class ScheduleListCommand implements Command {

	@Override
	public void execute() throws Exception {
		ScheduleService service = ScheduleServiceImpl.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		String thisMonth = sdf.format(new Date());
		
		Prompt prompt = new Prompt();
		while(true) {
			List<Schedule> list = service.list(thisMonth);//defalt값 처리먼저
			Collections.sort(list);
			printList(list);
			
			thisMonth = prompt.getString("월 선택");
			if(thisMonth.equals("q")) {
				break;
			}
		}
	}
	
	private void printList(List<Schedule> list) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		for(int i=0; i<list.size();i++) {
			Schedule sch = list.get(i);
			System.out.printf("<%d> 일정 : [%d] %s%n",i,sch.getId(),sch.getContent());
			System.out.printf("     날짜 : %s%n",sdf.format(sch.getDate()));
			System.out.println();
		}
	}

}
