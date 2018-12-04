package chapter05;

public class Ex05_ArrayTest {
	public static int sum(int[] scores) {
		/*
		 * for(int i=0;i<scores.length;i++) { System.out.println("scores[" +i+ "] : "
		 * +scores[i]); }
		 */
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("합계 : " + sum);
		return sum;
	}

	public static void printArray(int[] scores) {
		System.out.print("scores[] : ");
		for (int i = 0; i < scores.length; i++) {
			// 순회한다 배열 elements
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] scores = { 78,45,34,11,18,64,28,49,31,95};
		printArray(scores);
		double avg = (double) (sum(scores)) / scores.length;
		System.out.printf("평균 : %.3f%n", avg);

		// 최소,최대값 찾기
		/*
		 * int min=scores[0]; int max=scores[0]; int minIndex = 0; int maxIndex = 0;
		 * 
		 * for(int i=0;i<scores.length;i++) { if(scores[i]<min) { min = scores[i];
		 * minIndex = i; } } System.out.println("최소값 : " + min+ " 인덱스 : " +scores+ "["
		 * +minIndex+ "]" ); for(int i=0;i<scores.length;i++) { if(scores[i]>max) { max
		 * = scores[i]; maxIndex = i; } } System.out.println("최대값 : " + max+ " 인덱스 : "
		 * +scores+ "[" + maxIndex + "]");
		 */
		
	//select sort 선택정렬
		for (int i = 0; i < scores.length; i++) {
			int min = scores[i];
			int minIndex = i;
			for (int j = i; j < scores.length; j++) {// 0-scores.length,1-,2-,3-,에서 비교
				if (scores[i] < min) {
					min = scores[i];
					minIndex = i;
				}
			}
			int t = scores[i];
			scores[i] = scores[minIndex];
			scores[minIndex] = t;
			// System.out.println("scores [" +minIndex+ "] 번째의 최소값: scores[" +min+ "]");
		}
		printArray(scores);

	}
}
