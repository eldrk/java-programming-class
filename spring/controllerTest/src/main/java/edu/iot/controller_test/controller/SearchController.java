package edu.iot.controller_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

//@Controller
@Slf4j
public class SearchController {

	@RequestMapping("/board/search")
	public String serch( @RequestParam(value="query",required=false) String query,
						 @RequestParam(value="page", defaultValue="1") int page) {
		log.info(query,page);
		return "board/search_result";
	}
			
}
