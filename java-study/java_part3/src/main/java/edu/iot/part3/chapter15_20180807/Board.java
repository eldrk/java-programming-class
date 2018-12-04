package edu.iot.part3.chapter15_20180807;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor//생성자생성
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Board {
	@EqualsAndHashCode.Include
	String subject;//subject필드를 포함하겠다
	String content;
	String writer;
	

}
