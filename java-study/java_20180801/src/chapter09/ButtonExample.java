package chapter09;

import chapter09.Button.OnClickListener;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(()->{//람다식표현(함수적표현)
				System.out.println("종료합니다.");
				System.exit(0);
		});
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		btn.setOnClickListener(new ChapterListener());
		btn.touch();
	}

}
