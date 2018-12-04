package edu.iot.tiles_test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.iot.tiles_test.model.Board;
import edu.iot.tiles_test.service.BoardService;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public void list(@RequestParam(value="page",defaultValue="1") int page,
									Model model)throws Exception {
		model.addAttribute("page",page);
		model.addAllAttributes(service.list(page));
	}
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public void view(@RequestParam("id") long id,
									Model model)throws Exception {
		Board board =service.findById(id);
		model.addAttribute("board",board);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public void updateForm(@RequestParam("id") long id,
			Model model)throws Exception {
		Board board = service.findById(id);
		model.addAttribute("board", board);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateSubmit(Board board) throws Exception{
		service.update(board);
		return "redirect:list";
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@RequestParam("id") long id) throws Exception{
		service.delete(id);
		return "redirect:list";
	}
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public void writeForm(Board board)throws Exception {
	
	}
	
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String writeSubmit(@Valid Board board, BindingResult result) throws Exception{
		if(result.hasErrors()) {
			return "board/write";
		}
		service.write(board);
		return "redirect:list";
	}
}
