package edu.iot.part3.chapter18_20180809;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("c:/temp/article.txt"));
		
		Map<String, Integer> map = new HashMap<>();//<단어,정수>
		String line;
		//1.한줄읽기
		//2.단어분리하기
		//3.계산하기
		//4.출력
		// 4.1 키set을 List로
		// 4.2 리스트순회
		// 4.3 value추출및출력
		
		while(scanner.hasNextLine()) {
			//line = scanner.next();단어를 return해준다
			line=scanner.nextLine();
			String[] words = line.split(" ");
			for(String word : words) {
				word= word.trim();//String은 불변객체로 원본은 그대로이다
				//if(word.equals("")){}
				if(word.equals("")) {
					continue;
				}
				word=word.toLowerCase();
				if(map.containsKey(word)) {//기존에 있는 경우
					int count = map.get(word) + 1;
					map.put(word, count);
				}else { //새로 등장한 경우
					map.put(word, 1);
				}
			}		
		}
		List<String> keys = new ArrayList<>(map.keySet());//set->list로
		Collections.sort(keys);//정렬
		for(String word : keys) {
			int count = map.get(word);
			System.out.printf("%s : %d%n", word,count);
			
		}
		
		
		System.out.println("종료");
	}

}
