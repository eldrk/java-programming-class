package ditest.dao;

import org.springframework.stereotype.Component;

import ditest.model.Article;

@Component("mySqlDao")
public class MysqlArticleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		System.out.println("Mysql 게시글 등록");
	}

}
