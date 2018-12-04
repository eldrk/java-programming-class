package chapter07;

class Airplane{
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반비행합니다");
	}
	
	public void takeoff() {
		System.out.println("이륙합니다");
	}
}

class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == 2) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
	}
}

public class Ex07_SupersonicAirplane {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		
		sa.flyMode = 1;
		sa.fly();
		
		sa.flyMode = 2;
		sa.fly();
		
		sa.land();
	}
}
