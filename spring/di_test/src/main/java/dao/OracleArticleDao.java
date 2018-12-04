package dao;

import model.Article;

public class OracleArticleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		System.out.println("게시글 등록");

	}

}
