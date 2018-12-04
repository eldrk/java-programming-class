package chapter05;
//call by reference : 원본이 변경된다
public class Ex04_SwpExample2 {
	public static void swap(int[] arr) {
		int t = arr[0];
		arr[0] = arr[1];
		arr[1] = t;
		
		System.out.println("호출중 : "+arr[0]+"," +arr[1]);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20};
		System.out.println("호출전 : "+arr[0]+"," +arr[1]);
		swap(arr);//원본에대한 참조를 넘겨 원본을 조작 
		System.out.println("호출후 : "+arr[0]+"," +arr[1]);
	}

}
