package edu.iot.jdbc_test.dao;

import java.util.List;

public interface PaginationDao<M> {
	List<M> getPage(int start, int end) throws Exception;
}
