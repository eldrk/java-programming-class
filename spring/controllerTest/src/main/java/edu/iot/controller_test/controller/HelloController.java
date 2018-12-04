package edu.iot.controller_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HelloController {
	@RequestMapping("/hello") //요청 URL
	public String hello() {
		return "hello";       //뷰이름 리턴
	} 
}
