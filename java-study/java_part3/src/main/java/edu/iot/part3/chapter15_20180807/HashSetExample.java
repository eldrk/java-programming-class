package edu.iot.part3.chapter15_20180807;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servelet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " +size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" +element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " +set.size());
		
		for(String str : set) {
			System.out.println("\t" +str);

		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음");}
	}
}
