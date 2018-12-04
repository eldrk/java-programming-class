package chapter09;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = ()->{//람다식 표현
			System.out.println("전화를 겁니다.");
		};

	
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(//람다식 표현
				()->System.out.println("메시지를 보냅니다."));				

	}
}
