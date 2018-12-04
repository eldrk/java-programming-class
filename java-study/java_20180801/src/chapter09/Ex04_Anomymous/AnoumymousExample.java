package chapter09.Ex04_Anomymous;



public class AnoumymousExample {

	public static void main(String[] args) {
		Anomymous anony = new Anomymous();
		 
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
				new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
						
					}

					@Override
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
						
					}
					
				}
				);
		 
	}

}
