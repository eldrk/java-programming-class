package service;

import dao.ArticleDao;
import model.Article;

public class ArticleWriteServiceImpl implements ArticleWriteService {
	
	private String name;
	private ArticleDao dao;
	
	public ArticleWriteServiceImpl(String name, ArticleDao dao) {
		this.name = name;
		this.dao = dao;
	}

	@Override
	public void write(Article article) {
		System.out.println(name + "서비스 :게시글등록");
		dao.insert(article);
	}

}
