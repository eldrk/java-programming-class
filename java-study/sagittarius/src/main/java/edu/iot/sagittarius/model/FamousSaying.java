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
public class FamousSaying {
	private long id;
	private String statement;
	private String who;
	private Date regDate;
	private Date updateDate;
}
