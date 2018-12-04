package edu.iot.sagittarius.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
	private String  	userId;
	private String  	name;
	private String 		password;
	private String		salt;
	private UserLevel userLevel;
	private String    phoneNumber;
	private String    nickName;
	private String    email;
	private String    address;
	private Date 			regDate;
	private Date			updateDate;
	
	
}
