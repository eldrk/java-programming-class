package edu.iot.jdbc_test.dao;

import java.util.List;

public interface CrudDao<M,K> {
	
	int count() throws Exception;
	int insert(M m) throws Exception;
	List<M> getList() throws Exception;
	M findById(K k) throws Exception;
	int update(M m) throws Exception;
	int delete(K k) throws Exception;

}
