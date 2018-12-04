package edu.iot.controller_test.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.iot.controller_test.model.Board;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value="/board")
public class BoardController {
	
	@ModelAttribute("keywords")
	public List<String> favorateKeyword(){
		List<String> list = new ArrayList<>();
		list.add("검색어1");
		list.add("검색어2");
		list.add("검색어3");
		list.add("검색어4");
		
		return list;
	}
	
	@Autowired
	ServletContext ctx;
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String form(Board board) {
		//log.info(ctx.getContextPath());
		return "board/board_write";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String submit(
			@ModelAttribute("board") @Valid Board board, 
										BindingResult result) {
		//log.info(board.toString());
		if(result.hasErrors()) {
			return "board/board_write";
		}
		return "board/board_write_result";
	}
	
	@RequestMapping(value="/search")
	public String serch( @RequestParam(value="query",required=false) String query,
						 @RequestParam(value="page", defaultValue="1") int page) {
		log.info("query : " +query , "page : " +page);
		return "board/search_result";
	}
}
