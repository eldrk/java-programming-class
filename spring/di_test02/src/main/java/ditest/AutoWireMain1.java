package ditest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ditest.model.Article;
import ditest.service.ArticleWriteService;

public class AutoWireMain1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("application-context.xml");
		
		ArticleWriteService service = 
				ctx.getBean("articleWriteServiceImpl",ArticleWriteService.class);
		
		Article article = new Article();
		service.write(article);
		
		ctx.close();
	}

}
