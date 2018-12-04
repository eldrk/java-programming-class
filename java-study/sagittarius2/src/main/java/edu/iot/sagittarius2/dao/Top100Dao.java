package edu.iot.sagittarius2.dao;

import edu.common.dao.CrudDao;
import edu.common.dao.PaginationDao;
import edu.common.dao.RandomDao;
import edu.iot.sagittarius2.model.Top100;

public interface Top100Dao  extends CrudDao<Top100, Long>,
																		PaginationDao<Top100>,
																		RandomDao<Top100>{

}
