package chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		System.out.println(scores);
		System.out.println(Arrays.toString(scores));
	
		String[] names = {"홍길동","박동수", "김민수"};
		Arrays.sort(names); //정렬안하면 binarySearch로 위치를 찾을수도있고 못찾을수도있다
		System.out.println(Arrays.toString(names));
		int ix = Arrays.binarySearch(names,"홍길동");
		System.out.println("홍길동의 위치 : " +ix);
		
		Member m1 = new Member("정자바", "java@naver.com");
		Member m2 = new Member("최자바", "qava@naver.com");
		Member m3 = new Member("정우성", "tava@naver.com");
		
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);//오름차순정렬
		System.out.println(Arrays.toString(members));
		
		int ix2 = Arrays.binarySearch(members,new Member("정우성","jawa@naver.com"));
		System.out.println("정우성의 위치 : " +ix2);
		
		//익명구현객체를 매개변수로 다룸
		Arrays.sort(members,(o1,o2)->o2.compareTo(o1));//람다식표현
		System.out.println(Arrays.toString(members));
		
		Arrays.sort(members,(o1,o2)->o1.email.compareTo(o2.email));
		System.out.println(Arrays.toString(members));
	}

}
