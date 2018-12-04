package edu.iot.mybatis_test.model;

import lombok.Data;

@Data
public class Search {
	private String category;
	private String keyword;
	
	public void setKeyword(String keyword){
		this.keyword = "%" +keyword +"%";
	}
}
