package edu.iot.capricom.service;

import java.util.List;

import edu.iot.capricom.model.Top100;

public interface Top100Service {
	List<Top100> random(int num) throws Exception;
}
