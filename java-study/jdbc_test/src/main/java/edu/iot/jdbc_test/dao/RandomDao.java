package edu.iot.jdbc_test.dao;

import java.util.List;

public interface RandomDao<M> {
	List<M> random(int num) throws Exception;
}
