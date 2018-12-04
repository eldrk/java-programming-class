package chapter05;

public class Ex03_ArraySort {
	
	
	//선택정렬 메소드
	public static int[] sortBySelection(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;		
				}			
				printArray(arr);
			}
			swap(arr,i,minIndex);

		}
		return arr;
	}
	
	
	//버블정렬 메소드
	public static int[] sortByBubble(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
					printArray(arr);
				}
			}
		}
		return arr;
		
	}
	
	
	//삽입정렬 메소드 = 카드정렬
	public static int[] sortByInsertion(int[] arr) {
		for(int i =1;i<arr.length;i++) {
			int data = arr[i];
			int aux = i-1;
			for(;aux >=0 && data<arr[aux];aux--) {
				arr[aux+1] = arr[aux];
				printArray(arr);
			}
			arr[aux+1] = data;
		}
		return arr;	
	}

	
	
	public static void printArray(int[] scores) {
		System.out.print("scores[] : ");
		for (int i = 0; i < scores.length; i++) {
			// 순회한다 배열 elements
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {54,34,64,13,74,32,75,23};
		printArray(arr);
		System.out.println();
		
		sortBySelection(arr);
		printArray(arr);
		System.out.println();
		
		sortByBubble(arr);
		printArray(arr);
		System.out.println();
		
		sortByInsertion(arr);
		printArray(arr);
		System.out.println();
	
	}
}
