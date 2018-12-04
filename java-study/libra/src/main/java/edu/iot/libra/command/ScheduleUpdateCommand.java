package edu.iot.libra.command;

import java.text.SimpleDateFormat;

import edu.iot.libra.model.Schedule;
import edu.iot.libra.service.ScheduleService;
import edu.iot.libra.service.ScheduleServiceImpl;
import edu.iot.libra.ui.Prompt;

public class ScheduleUpdateCommand implements Command {

	@Override
	public void execute() throws Exception {
		ScheduleService service = ScheduleServiceImpl.getInstance();
		Prompt prompt = new Prompt();
		int id = prompt.getInt("스케줄 ID");
		int index = service.findById(id);
		if(id == -1) {
			System.out.println("존재하지 않는 ID입니다.");
			return;
		}
		
		Schedule sch = service.getSchedule(index);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		System.out.printf("날짜 : %s%n", sdf.format(sch.getDate()));
		String strDate = prompt.getString("수정 날짜");
		if(!strDate.equals("")) {
			sch.setDate(sdf.parse(strDate));//참조값인 원본을 받은것이므로 따로저장이 필요없다
		}
			
	
		System.out.printf("일정 : %s%n", sch.getContent());
		String content = prompt.getString("수정 일정");
		if(!content.equals("")) {
			sch.setContent(content);
		}
		
		System.out.printf("장소 : %s%n", sch.getLocation());
		String location = prompt.getString("수정 장소");
		if(!content.equals("")) {
			sch.setLocation(location);
		}
		
		//테스트 확인용
		System.out.println(sch);
	}

}
