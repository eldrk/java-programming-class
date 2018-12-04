package ditest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarmeraEx {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("application-context.xml");
		
		Camera camera1 = ctx.getBean("camera1",Camera.class);
		System.out.println(camera1);
		ctx.close();
	}

}
