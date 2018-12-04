package chapter06;
class Calculator03{
	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}

public class EX06_Calculator03 {
	//int a =10;인스턴스필드이므로 문법에러가 난다
	static int a = 10;
	public static void main(String[] args) {
		System.out.println("a : " +a);
		//System.out.println("a : " +this.a);
		
		double result1 = 10*10*Calculator03.pi;
		int result2 = Calculator03.plus(10, 5);
		int result3 = Calculator03.minus(10, 5);
		
		System.out.println("result1 : " +result1);
		System.out.println("result2 : " +result2);
		System.out.println("result3 : " +result3);
		
	}

}
