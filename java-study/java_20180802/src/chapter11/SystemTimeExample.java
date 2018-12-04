package chapter11;

public class SystemTimeExample {
	public static void main(String[] args) {
		float time1 = System.nanoTime();
		
		float sum = 0;
		for(float i = 1; i<1000000000; i++) {
			sum += i;
		}
		
		float time2 = System.nanoTime();
		
		System.out.println("1~1000000000 까지의 합 : " +sum );
		System.out.println("계산에 " + (time2-time1) + "나노초가 소요되었습니다.");
	}
}
