package edu.iot.libra.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import edu.iot.libra.model.Schedule;

/**
 *<pre>
 *edu.iot.libra.service
 *ScheduleServiceImpl.java
 *
 *Schedule 객체를 List로 관리하는 싱글톤 서비스 객체
 *예)
 *ScheduleService service = ScheduleServiceImpl.getInstance();
 *</pre>
 *
 * @author student
 *
 */
public class ScheduleServiceImpl implements ScheduleService {
	
	static final String FILE_PATH = "c:/temp/schedule.dat";
	
	/**
	 * 
	 */
	private List<Schedule> list;
	
	private static ScheduleServiceImpl instance = new ScheduleServiceImpl();

	/**
	 * 싱글톤 객체를 위한 private 생성자
	 */
	private ScheduleServiceImpl() {
		File file = new File(FILE_PATH);
		if(file.exists()) {
			load();
		}else {
			list = new LinkedList<>();
			init();
		}
	}

	/**
	 * 싱글톤 객체 참조를 리턴하는 static 메서드
	 * @return 싱글톤 객체 참조
	 */
	public static ScheduleServiceImpl getInstance() {
		return instance;
	}
	
	
	private void init() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			list.add(new Schedule(sdf.parse("2018-07-17 10:00"),"제헌절 기념식 참가","국회"));
			list.add(new Schedule(sdf.parse("2018-05-10 14:35"),"등산","남산"));
			list.add(new Schedule(sdf.parse("2018-08-15 10:00"),"광복절 기념식 참가","광화문"));
			list.add(new Schedule(sdf.parse("2018-09-26 10:30"),"추석 귀향","서울역"));
			list.add(new Schedule(sdf.parse("2018-08-11 14:00"),"시체놀이","집"));
			list.add(new Schedule(sdf.parse("2018-07-17 15:34"),"영화보기","메가박스"));
			list.add(new Schedule(sdf.parse("2018-01-01 10:45"),"해돋이","간절곶"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void add(Schedule sch) {
		list.add(sch);

	}

	@Override
	public List<Schedule> list() {
		return list;
	}

	/* (non-Javadoc)
	 * @see edu.iot.libra.service.ScheduleService#list(java.lang.String)
	 */
	@Override
	public List<Schedule> list(String yearMonth) {
		//월단위의 일정을 보여달라->제일어려운부분
		List<Schedule> temp = new LinkedList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		//순회하면서 조건을 만족하는 스케줄담기
		for(Schedule sch : list) {
			Date date = sch.getDate();
			String strDate = sdf.format(date);
			if(yearMonth.equals(strDate)) {//NullPointException발생주의
				temp.add(sch);
			}
		}
		return temp;
	}

	@Override
	public Schedule getSchedule(int index) {
		return list.get(index);
	}

	@Override
	public void setSchedule(int index, Schedule sch) {
		list.set(index,sch);

	}

	@Override
	public void removeSchedule(int index) {
		list.remove(index);

	}

	@Override
	public int findById(int id) {
		for(int i=0; i<list.size();i++) {
			Schedule sch = list.get(i);
			if(id == sch.getId()) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void save() {
		
		try(
				FileOutputStream fos = new FileOutputStream(FILE_PATH);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(Schedule.scheduleId); //저장안하면 실행시마다 0이되어 error가 생긴다
			oos.writeObject(list);
			oos.flush();
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
	
	public void load() {
		
		try(
				FileInputStream fis = new FileInputStream(FILE_PATH);
				ObjectInputStream ois = new ObjectInputStream(fis);
		){
			Schedule.scheduleId = (int) ois.readObject();
			list = (List<Schedule>) ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
