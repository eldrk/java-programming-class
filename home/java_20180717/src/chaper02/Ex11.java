package chaper02;

public class Ex11 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 70;
		int num3 = 80;
		int sum;
		double average;
		
		sum = num1+num2+num3;
		average = sum/3.;
		//average = (double)sum/3;
		System.out.printf("총점 : %d점 , 평균 : %.3f점",sum,average);
	}
}
