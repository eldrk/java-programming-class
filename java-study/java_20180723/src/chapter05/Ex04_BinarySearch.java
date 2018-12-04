package chapter05;

public class Ex04_BinarySearch {
	public static int search(int[] arr, int target) {
		int first = 0;
		int last = arr.length-1;
		int mid;
		
		while (first <= last) {
			mid = (first + last) /2;
			if(target == arr[mid]) {
				return mid;
			}else {
				if(target < arr[mid]) {
					last = mid -1;
				}else {
					first = mid+1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {11,21,31,41,43,43,65,65,87,97,99};
		int value = 65;
		int index = search(arr, value);
		if(index >=0 ) {
			System.out.println(value + "의 인덱스 " +index);
		}else {
			System.out.println(value + "은 없습니다.");
		}
	}

}
