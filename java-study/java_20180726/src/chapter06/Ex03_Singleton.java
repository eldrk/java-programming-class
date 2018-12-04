package chapter06;

class Singleton{
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
	
	public void greet(String name) {
		System.out.println("Hello " + name);
	}
}

public class Ex03_Singleton {
	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		obj1.greet("홍길동");
		
	}
}
