
public class SortTest {


 

	public static void sortByBubble(int[] a) {

 

		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < (a.length - j - 1); i++) {

				if (a[i] > a[i + 1]) {

					swap(a, i, i + 1);

				}

			}

		}

	}
	
	public static int random(int start, int range) {
		
		return (int) (Math.random() * range) + start;
		
	}

 

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

		System.out.println();

	}

 


	public static void swap(int[] a, int i1, int i2) {
		
		int temp;
		
		temp = a[i1];
		
		a[i1] = a[i2];
		
		a[i2] = temp;
		
	}
 

	public static void main(String[] args) {

 

		int[] arr = new int[40];

		for(int i=0;i<40;i++) {

			arr[i]=random(1,100);

		}

		

		System.out.println("정렬 전 배열 : ");

		printArray(arr);

		sortByBubble(arr);

		

		System.out.println("정렬 후 배열 : ");

		printArray(arr);

 

	}

}
