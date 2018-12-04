package edu.iot.part3.chapter15_20180807;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data//tostring+hash+equals 오버라이딩 어노테이션
@AllArgsConstructor
public class Member {
	public String name;
	public int age;

}
