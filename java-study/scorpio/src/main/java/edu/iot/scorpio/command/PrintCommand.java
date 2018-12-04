package edu.iot.scorpio.command;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import edu.iot.common.command.Command;
import edu.iot.scorpio.model.TourItem;
import edu.iot.scorpio.model.TourPlan;
import edu.iot.scorpio.model.TourSpot;

public class PrintCommand implements Command {

	@Override
	public void execute() throws Exception {
		TourPlan plan = service.getPlan();
		String path = "c:/temp/tour.html";
		try(
				PrintWriter pw = new PrintWriter(new FileWriter(path));
		){
			pw.println("<html>");
			pw.println("<head>");
			pw.printf("<title>%s</title>\n",plan.getTitle());
			pw.println("</head>");
			pw.println("<body>");
			pw.printf("<h3>%s</h3>\n",plan.getTitle());
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			pw.println();
			pw.println("<p>==========================================");
			pw.println("<p>제목 : " +plan.getTitle() + "</p>");
			pw.printf("<p>기간 : %s ~%s\n</p>",sdf.format(plan.getBegin()),sdf.format(plan.getEnd()));
			pw.println("<p>내용: \n" + plan.getDescription() + "</p>");
			pw.println("<p>==========================================");
			
			//세부일정
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			List<TourItem>tourList = plan.getTourList();
			pw.printf("<p>세부일정(%d건)</p>\n",tourList.size());
			pw.println("<table>");
			for(int i=0; i<tourList.size(); i++) {
				TourItem item = tourList.get(i);
				pw.printf("<tr><td>%d</td><td>%s</td><td>%s</td>", i,sdf2.format(item.getDate()),
						item.getSpot().getName());
			}
			pw.println("</table>");
			pw.println("<hr>");
			for(int i=0; i<tourList.size();i++) {
				TourSpot spot = tourList.get(i).getSpot();
				pw.printf("<p>%d.%s</p>",i,spot.getName());
				pw.printf("<p>%s</p>",i,spot.getRegion());
				pw.printf("<p>%s</p>",i,spot.getLocation());
				pw.printf("<p>%s</p>",i,spot.getContent());
				pw.printf("<p>%s</p>",i,spot.getAddress());
			}
			pw.println("</body>");
			pw.println("</html>");
			new ProcessBuilder("cmd","/c","start",path).start();//파일명을 주면 웹브라우저가 자동열어준다
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
