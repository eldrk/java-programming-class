package edu.iot.part3.chapter15_20180807;

import java.util.ArrayList;
import java.util.List;

public class SearchExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		for(int i=0;i<=5;i++) {
			list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
		}
		int ix = list.lastIndexOf(new Board("제목3",null,null));
		System.out.println(ix);
	}

}
