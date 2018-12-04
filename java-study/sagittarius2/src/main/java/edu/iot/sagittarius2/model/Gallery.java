package edu.iot.sagittarius2.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Gallery {
	private long id;
	private String title;
	private String description;
	private String fileName;
	private long fileSize;
	@ToString.Exclude private byte[] image;
	@ToString.Exclude private byte[] thumb;
	private Date regDate;
	private Date updateDate;
}
