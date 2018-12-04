package edu.iot.controller_test.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.iot.controller_test.model.Board;
import lombok.extern.slf4j.Slf4j;

//@Controller
@Slf4j
public class WriteBoardController {
	@Autowired
	ServletContext ctx;
	
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public String form() {
		log.info(ctx.getContextPath());
		return "board/board_write";
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String submit(
			@ModelAttribute("command")Board board) {
		log.info(board.toString());
		return "board/board_write_result";
	}
}
