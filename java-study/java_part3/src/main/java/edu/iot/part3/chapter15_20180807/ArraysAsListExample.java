package edu.iot.part3.chapter15_20180807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> temp = Arrays.asList("김자바","최자바","정자바");
		List<String> list1 = new ArrayList<>(temp);
		
		list1.add("나자바봐라");
		list1.add("헤헤헤");
		
		for(String name : list1) {
			System.out.println(name);
		}
		System.out.println();
		
		
		List<Integer>list2 = Arrays.asList(45,46,47);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
