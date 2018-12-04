package chapter03;

public class Ex04_Method01 {
	public static void main(String[] args) {
		int result;
		result = add(3,4);
		//return;
		System.out.println("result : " +result);
	}
	static int add(int num1, int num2) {
		int sum;
		sum = num1+num2;
		return sum;
		//return 10.0;
		//return 'A';자동형변환규칙에 맞으므로 에러에 생기지않는다
	}
}
