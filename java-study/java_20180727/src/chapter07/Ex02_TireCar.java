package chapter07;

class Tire{
	public int maxRotation;          //최대회전수(타이어수명)
	public int accumulatedRotation;  //누적 회전수
	public String location;          //타이어 위치
	
	public Tire(String location,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation< maxRotation) {
			System.out.println(location + "Tire 수명 : " +
					(maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location+ " Tire 펑크 ***");
			return false;
		}
	}
}

class Car{
	private Tire[] tires = { 
										new KumhoTire("앞왼쪽",6),
										new Tire("앞오른쪽",2),
										new KumhoTire("뒤왼쪽",3),
										new Tire("뒤오른쪽",4)
								 };
//	Tire frontLeftTire = new Tire("앞왼쪽",6);
//	Tire frontRightTire = new Tire("앞오른쪽",2);
//	Tire backLeftTire = new Tire("뒤왼쪽",3);
//	Tire backRightTire = new Tire("뒤오른쪽",4);
	
	public int run() {
		System.out.println("[자동차가 달립니다]");
		for(int i=0;i<tires.length;i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
		}
		
//		if(frontLeftTire.roll() == false) {stop(); return 1;}
//		if(frontRightTire.roll() == false) {stop();return 2;}
//		if(backLeftTire.roll() == false) {stop();return 3;}
//		if(backRightTire.roll() == false) {stop();return 4;}
//		return 0;
	}
		return 0;
}
	
	public void changeTire(int location, Tire tire) {
		tires[location-1] = tire; 
		
	}
	
	public void stop() {
		System.out.println("----------------------------");
		System.out.println("[자동차가 멈춥니다]");
	}
	
}

class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRocation) {
		super(location,maxRocation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명: "+
		    (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
		}
		return false;
	}
}

class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명: "+
		    (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
		}
		return false;
	}
}

public class Ex02_TireCar {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
				if(problemLocation !=0 ) {
					car.changeTire(problemLocation, new HankookTire(problemLocation +"타이어",15));
					/*System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
					car.tires[problemLocation-1] = 
							new HankookTire(car.tires[problemLocation-1].location,15);*/
				}
			/*switch(problemLocation) {
				
				case 1 :
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.tires[0] = new HankookTire("앞왼쪽",15);
					break;
					
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.tires[1] = new KumhoTire("앞오른쪽",13);
					break;
				
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.tires[2] = new HankookTire("앞오른쪽",14);
					break;
				
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.tires[3] = new KumhoTire("앞오른쪽",17);
					break;
				
			}*/
			System.out.println("----------------------------");
		
		}
	}

}
