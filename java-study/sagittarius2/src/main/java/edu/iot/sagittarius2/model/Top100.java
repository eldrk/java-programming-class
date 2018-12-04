package edu.iot.sagittarius2.model;

import java.util.Date;

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
}
