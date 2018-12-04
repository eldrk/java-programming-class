package edu.iot.chapter04.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Member {
	String userID;
	String userPwd;
	String name;
	String loginCheck;
}
