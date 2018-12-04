import org.springframework.context.support.GenericXmlApplicationContext;

import model.Article;
import service.ArticleWriteService;

public class ArticleWriteEx {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:application-context.xml");
		
		ArticleWriteService service = 
				ctx.getBean("articleWriteService",ArticleWriteService.class);
		System.out.println("설정ok: " +service);
		
		Article article = new Article();
		service.write(article);
		ctx.close();
	}

}
