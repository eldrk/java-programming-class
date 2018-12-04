package edu.iot.tiles_test.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class Board {
	@NotEmpty(message="필수항목입니다.")
	private String title;
	@NotEmpty(message="필수항목입니다.")
	private String writer;
	private String content;
	private Date regDate;
	
	public Board() {
		regDate = new Date();
	}
}
