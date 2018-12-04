package chapter06.cartest1;

class Car{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {}

	public Car(String model) {
		this(model,"은색",250);
	}

	public Car(String model, String color) {
		this(model,"노랑",250);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

//	@Override
//	public String toString() {//retrun값을 출력하라
//		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
//	}

}

public class Ex07_Car {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.model : " +car1.model);
		System.out.println("car1.color : " +car1.color);
		System.out.println("car1.maxSpeed : " +car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.model : " +car2.model);
		System.out.println("car2.color : " +car2.color);
		System.out.println("car2.maxSpeed : " +car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.model : " +car3.model);
		System.out.println("car3.color : " +car3.color);
		System.out.println("car3.maxSpeed : " +car3.maxSpeed);
		System.out.println();
		
		String str = "홍길동";//이 tostring은 문자열을 출력하라고 생성되어있다
		System.out.println(str);
		
	}


}
