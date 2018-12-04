package chapter05;

public class Ex05_ArrayTest {
	public static int sum(int[] scores) {
/*		for(int i=0;i<scores.length;i++) {
			System.out.println("scores[" +i+ "] : " +scores[i]);
		}*/
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("합계 : " +sum);
		return sum;
	}
	
	public static void printArray(int[] scores) {
		System.out.print("scores[] : ");
		for(int i=0;i<scores.length;i++) {
		//순회한다      배열 elements
			System.out.print(scores[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[] scores = {88,23,45,60,34,90,10,76,45,60};
		printArray(scores);
		double avg = (double)(sum(scores))/scores.length;
		System.out.println("평균 :  " + avg );
	}
}
