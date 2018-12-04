package edu.iot.controller_test.model;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Member {
	@NotEmpty(message="사용자ID는 필수사항입니다")
	@Length(min=4 , message="사용자ID는 4글자 이상이어야합니다.")
	private String userId;
	
	LoginType loginType;
	
	List<String> favorites;
	
	boolean agreement;
	
	@NotEmpty(message="비밀번호는 필수사항입니다")
	@Length(min=6 , message="패스워드는 6글자 이상이어야합니다.")
	private String password;
	
	@NotEmpty(message="이메일은 필수사항입니다")
	@Email(message="email양식을 위배했습니다.")
	private String email;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
}
