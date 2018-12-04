package edu.iot.part3.chapter18_20180809;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import lombok.AllArgsConstructor;

public class WordCount2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		@AllArgsConstructor
		class WordInfo{
			String word;
			int count;
		}
		
		Scanner scanner = new Scanner(new File("c:/temp/article.txt"));
		
		Map<String, WordInfo> map = new HashMap<>();
		String line;
		while(scanner.hasNextLine()) {
			line=scanner.nextLine();
			String[] words = line.split(" ");
			for(String word : words) {
			if(word.equals("")) {
				continue;
			}
			word=word.toLowerCase();
			WordInfo wf = map.get(word);
			if(wf == null) {
				wf = new WordInfo(word,1);
				map.put(word, wf);
			}else {
				wf.count++;
			}
			
		}
		
		}
		
		List<WordInfo> wordList = new ArrayList<>(map.values());
		Collections.sort(wordList, new Comparator<WordInfo>() {//정렬

			@Override
			public int compare(WordInfo w1, WordInfo w2) {
				return w2.count - w1.count;
			}			
		});
		
		for(WordInfo wf : wordList) {
			System.out.printf("%s : %d%n", wf.word,wf.count);
		}
		
		System.out.println("종료");
		}

}
