package ditest.dao;

import org.springframework.stereotype.Component;

import ditest.model.Article;

@Component("oracleDao")
public class OracleArticleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		System.out.println("게시글 등록");

	}

}
