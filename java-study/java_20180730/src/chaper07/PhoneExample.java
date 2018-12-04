package chaper07;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnoff();
		
		Phone phone = new SmartPhone("홍길동");
		
		phone.turnOn();
		((SmartPhone)phone).internetSearch();
		phone.turnoff();
	}
}
