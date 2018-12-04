package chapter06;

class Calculator01{//생성자는 default 하나존재
	
	PowerState currentState;
	double result;
	
	public Calculator01() {
		//currentState = false;
		currentState = PowerState.OFF;//참조변수이므로 초기값을 선언해줘야한다
	}

	public Calculator01(PowerState currentState) {
		this.currentState = currentState;
	}
	
	boolean isPowerOn() {
		return currentState == PowerState.ON;
			
	}
	
	// 전원 제어 메서드 시작
	void powerOn() {
		currentState = PowerState.ON;
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
		currentState = PowerState.OFF;
	}
	
	//연산 관련 메서드 시작
	int plus(int x, int y) {
		result = x+y;
		return (int)result;
	}
	
	int plus(int x) {
		result += x;
		return (int)result;
	}
	
	double divide (int x , int y) {
		result = (double)x / (double)y;
		return result;
	}
	
	double divide(int x) {
		result /= x;
		return result;
	}
	
	double clear() {
		result = 0;
		return (int)result;
	}
	
	
}

public class Ex01_Calculataor01 {
	public static void main(String[] args) {
		Calculator01 myCalc = new Calculator01();
		//myCalc.powerOn();
	

		if(!myCalc.isPowerOn()) {//내가값을 지정하는것이아니라 질문해야한다
			myCalc.powerOn();
		}
		
			System.out.println("+7  => " +myCalc.plus(7));
			System.out.println("+5  => " +myCalc.plus(5));
			System.out.println("C   => " +myCalc.clear());
			System.out.println("+3  => " +myCalc.plus(3));
			System.out.println("+4  => " +myCalc.plus(4));
			System.out.println("2+3 => " +myCalc.plus(2, 3));
			System.out.println("/2  => " +myCalc.divide(2));
			System.out.println("clear  " +myCalc.clear());
			
		
/*			int result1 = myCalc.plus(5, 6);
			System.out.println("result1 : " +result1);


		//myCalc.powerOff();	
		if(myCalc.currentState == PowerState.ON) {
			byte x = 10;
			byte y = 4;
			double result2 = myCalc.divide(x, y);
			System.out.println("result2 : " +result2);
		}else {
			System.out.println("계산기가 꺼져있습니다");
		}*/
		
		myCalc.powerOff();
	}

}
