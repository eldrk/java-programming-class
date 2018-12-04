package chapter05;

public class Ex02_ArrayCreatebyValueList {
	public static void main(String[] args) {
		//int[] scores = {83,90,87};
		int[] scores1;
		scores1 = new int[] {83,90,87};
		
		for(int i=0;i<3;i++) {
			System.out.println("scores1["+i+"] : " +scores1[i]);
		}
		
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum +=scores1[i];
		}
		double avg = sum/3.0;
		System.out.println("총합 : " +sum+  "\n평균 : " +avg);
	}

}
