package dao;

import model.Article;

public class MysqlArticleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		System.out.println("Mysql 게시글 등록");
	}

}
