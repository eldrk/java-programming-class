package edu.iot.sagittarius.dao;

import edu.common.dao.CrudDao;
import edu.common.dao.PaginationDao;
import edu.common.dao.RandomDao;
import edu.iot.sagittarius.model.FamousSaying;

public interface FamousSayingDao extends CrudDao<FamousSaying, Long> ,
																			   PaginationDao<FamousSaying> ,
																			   RandomDao<FamousSaying>{

}
