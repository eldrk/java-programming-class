package edu.iot.tiles_test.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class Member {
	@NotEmpty(message="필수 항목입니다")
	@Length(min=4,message="4글자 이상이어야 합니다.")
	private String userId;
	
	@NotEmpty(message="필수 항목입니다")
	@Length(min=6,message="6글자 이상이어야 합니다.")
	private String password;
	
	@NotEmpty(message="필수 항목입니다")
	private String name;
	
	@NotEmpty(message="필수 항목입니다")
	@Email(message="email양식을 위반했습니다.")
	private String email;
}
