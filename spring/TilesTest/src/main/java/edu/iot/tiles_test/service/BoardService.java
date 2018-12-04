package edu.iot.tiles_test.service;

import java.util.Map;

import edu.iot.tiles_test.model.Board;

public interface BoardService {
	
	Map<String,Object> list(int page) throws Exception;
	Board findById(long id) throws Exception;
	void write(Board board) throws Exception;
	void update(Board board) throws Exception;
	void delete(long id) throws Exception;
	
}
