package chapter07;

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
	public void stop() {
		System.out.println("차량이 멈춥니다.");
	}
}

class Driver{
	public void drive(Vehicle vehicle) {
		vehicle.run();
		vehicle.stop();
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
}

public class Ex03_VehicleDriver {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
