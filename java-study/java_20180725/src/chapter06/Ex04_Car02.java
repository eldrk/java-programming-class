package chapter06;

class Car02{
	
	int speed;
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:" +speed+ "km/h)");
		}
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return speed;
	}
	
	
}

public class Ex04_Car02 {
	public static void main(String[] arags) {
		Car02 myCar = new Car02();
		
		myCar.keyTurnOn();//instance상태를 변화시키는 메서드가 아니므로 순서는 상관없다
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : "  +speed+ "km/h");
		
	}

}
