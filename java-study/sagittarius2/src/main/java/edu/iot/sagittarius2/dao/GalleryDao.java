package edu.iot.sagittarius2.dao;

import edu.common.dao.CrudDao;
import edu.common.dao.PaginationDao;
import edu.common.dao.RandomDao;
import edu.iot.sagittarius2.model.Gallery;

public interface GalleryDao extends CrudDao<Gallery, Long>, 
																		PaginationDao<Gallery>, 
																		RandomDao<Gallery> {

}
