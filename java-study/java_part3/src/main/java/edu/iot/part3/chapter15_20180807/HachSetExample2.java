package edu.iot.part3.chapter15_20180807;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HachSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",20));
		
		List<Member> list = new ArrayList<>(set);
		System.out.println(list);
		System.out.println("총 객체수 : " +set.size());
	}

}
