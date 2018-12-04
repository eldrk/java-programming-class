package chapter04;
//call by value
public class Ex24_SwapExample {
	
	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
		/*a = 30;
		b = 40;
		return a+b;
		*/
		System.out.println("호출중 : " +a+ ", " +b);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("호출 전: " +a+ ", " +b);
		swap(a,b);//call by value 복사본이 넘어가므로 원본에는 아무지장이없다
		System.out.println("호출 후: " +a+ ", " +b);
	}

}
