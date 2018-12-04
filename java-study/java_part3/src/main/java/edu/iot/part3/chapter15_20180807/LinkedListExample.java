package edu.iot.part3.chapter15_20180807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String>list1 = new ArrayList<String>();
		List<String>list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
	
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
			list1.add("Java");
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " +(endTime-startTime)+" ns");
		
		startTime = System.nanoTime();
		for(int i=0;i<10000; i++) {
			list2.add(0,String.valueOf(i));
			list2.add("Java");
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " +(endTime-startTime)+" ns");
	}
}
