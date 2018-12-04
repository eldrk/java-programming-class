package edu.iot.controller_test.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class Board {
	@NotEmpty(message="필수사항입니다")
	@Length(min=10, message="최소 10글자이상입니다.")
	private String title;
	@NotEmpty(message="필수사항입니다")
	private String writer;
	@Length(min=100,message="최소 100글자 이상입니다.")
	private String content;
}
