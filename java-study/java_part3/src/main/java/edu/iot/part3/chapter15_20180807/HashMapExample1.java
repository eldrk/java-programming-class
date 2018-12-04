package edu.iot.part3.chapter15_20180807;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		map.put("정자바", 85);
		map.put("홀길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		//Primitive 데이터처리
		int score;
		//예외발생 : NullpointerException
		//score = map.get("홍길동2")
		
		//1.키존재 유무검사후 처리
//		if(map.containsKey("홍길동2")) {
//			score = map.get("홍길동2");
//		}else {
//			System.out.println("홍길동2 데이터는 없습니다.");
//		}
//		
//		2.Integer Wrapper클래스로 Null인 경우 대응
//		Integer score = map.get("홍길동2");
//		if(score == null) {
//			System.out.println("홍길동2 데이터는 없습니다);
//		}
		
		
		System.out.println("총 Entry 수 : " +map.size());
		
		System.out.println("\t홍길동 : " +map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" +key+ ":" +value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수: " +map.size());
		Set<Map.Entry<String, Integer>>entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>>entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer>entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key+ " : " + value);
		}
			System.out.println();
			
			map.clear();
			System.out.println("총 Entry수 :" +map.size());
	}
}
