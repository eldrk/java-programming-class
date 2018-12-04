package edu.iot.part3.chapter15_20180807;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor//default생성자
@AllArgsConstructor//필드전체 생성자
public class User {
	String userId;
	String password;
	String name;

}
