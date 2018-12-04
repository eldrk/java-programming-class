package chapter05;

public class Ex03_ArrayCreatebyValueList2 {
	
	public static int add(int[] scores) {
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores["+i+"] : " +scores[i]);
		}
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum +=scores[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//int[] scores = {83,90,87};
		int[] scores;
		scores = new int[] {89,45,65,34,65,35,75,24};
				
		int sum1 = 0;
		sum1 = add(scores);
		double avg1 = sum1/3.0;	
		System.out.println("총합 : " +sum1+  "\n평균 : " +avg1);
		
		int sum2 = add(new int[] {78,67,75});
		double avg2 = sum2/3.0;	
		System.out.println("총합 : " +sum2+  "\n평균 : " +avg2);
	}

}
