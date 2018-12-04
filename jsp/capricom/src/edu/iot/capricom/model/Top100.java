package edu.iot.capricom.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Top100 {
	
	private long id;
	private String title;
	private	String location;
	private String region;
	private String content;
	private String address;
	private String homePage;
	private Date regDate;
	private Date updateDate;
	List<String> imageList;
	
	public String getSummary() {
		return content.substring(0,20) + "...";
	}
}
