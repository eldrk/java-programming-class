package edu.iot.scorpio.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import edu.iot.common.command.Command;
import edu.iot.common.command.Prompt;
import edu.iot.scorpio.model.TourItem;
import edu.iot.scorpio.model.TourPlan;
import edu.iot.scorpio.service.TourPlanService;
import edu.iot.scorpio.service.TourPlanServiceImpl;

public class PlanManageCommand implements Command {
	TourPlanService service = TourPlanServiceImpl.getInstance();

	@Override
	public void execute() throws Exception {
		TourPlan plan = service.getPlan();
		if(plan == null) {
			System.out.println("여행 계획이 없습니다.");
			return;
		}
		
		printSummary(plan);
		Prompt prompt = new Prompt();
		while(true) {
			printSchedule(plan.getTourList());
			String select = prompt.getString("a/d/q");
			
			if(select.equals("a")) { //일정 추가
				addSchedule();
			}else if(select.equals("d")) { //일정 삭제
				deleteSchedule();
			}else if(select.equals("q")) {
				break;
			}
		}
	}
	
	private void deleteSchedule() {
		Prompt prompt = new Prompt();
		int ix = prompt.getInt("일정번호");
		if(ix != -1) {
			service.deleteSchedule(ix);
		}
	}
	
	private void addSchedule() {
		//날짜/시간 과 spot id를 입력받아 추가
		Prompt prompt = new Prompt();
		Date date;
		try {
			date = prompt.getDate("날짜/시간","yyyy-MM-dd HH:mm");
			service.addSchedule(date,spotid);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int spotId = prompt.getInt("방문지 ID");
		//일정추가
		
	}
	
	public void printSummary(TourPlan plan) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println();
		System.out.println("==========================================");
		System.out.println("제목 : " +plan.getTitle());
		System.out.printf("기간 : %s ~%s\n",sdf.format(plan.getBegin()),sdf.format(plan.getEnd()));
		System.out.println("내용: \n" + plan.getDescription());
		System.out.println("==========================================");
		
	}
	
	public void printSchedule(List<TourItem> tourList) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.printf("세부일정(%d건)\n",tourList.size());
		System.out.println("==========================================");
		for(int i=0; i<tourList.size(); i++) {
			TourItem item = tourList.get(i);
			System.out.printf("%d] %s %s\n", i,sdf.format(item.getDate()),item.getSpot().getName());
		}
		System.out.println("==========================================");
	}
}
