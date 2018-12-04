package ditest.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ditest.dao.ArticleDao;
import ditest.model.Article;

@Component
public class ArticleWriteServiceImpl implements ArticleWriteService {
	
//	@Autowired 구현체가 하나일경우
//	@Qualifier("oracleDao")
	@Resource(name="mySqlDao") //구현체가 두개이상을경우 id값을 name에써준다
	private ArticleDao dao;
	
//	public void setArticleDao(ArticleDao dao) {
//		this.dao = dao;
//	}

	@Override
	public void write(Article article) {
		System.out.println("서비스 : 게시글등록");
		dao.insert(article);
	}

	@PostConstruct
	public void init() {
		System.out.println(dao);
		System.out.println("서비스 준비 됬습니다.");
	}	
	
	@PreDestroy
	public void close() {
		System.out.println("서비스가 종료합니다");
	}
}
