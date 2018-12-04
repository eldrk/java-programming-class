package edu.iot.virgo.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.iot.common.util.ArrayUtil;
import edu.iot.common.util.FileUtil;
import edu.iot.common.util.Random;
import edu.iot.virgo.model.Saying;

public class FamousSaying {
	
	private final static String FILE_PATH = "c:/temp/famoussaying.txt";
	
	private Saying[] archive;
	
	private int index;
	
	//싱글톤 패턴 구조
	private FamousSaying() {//생성자 private
		//init();
		load();
	}
	private static FamousSaying instance = new FamousSaying();//변수명 instance는 마음데로
	
	public static FamousSaying getInstance() {
		return instance;
	}
	
	public void load() {
		File file = new File(FILE_PATH);
		
		List<Saying> list = new ArrayList<>();
		List<String> lines = FileUtil.readLines(file);
		for(String line : lines) {
			String[] temp = line.split("#");
			list.add(new Saying(temp[0], temp[1]));
		}
		
		Collections.shuffle(list);//list의 내용을 random하게 섞어줌
		
		//list를 배열에 담기
		archive = new Saying[list.size()];
		list.toArray(archive);
	}
	
	
	
	
	public void init() {//섞는역할 생성자에서 호출필요
		for(int i=archive.length;i>0;i--) {
			//int select = (int)(Math.random()*i);
			int select = Random.rand(0, i);
			//i와 select교환
			ArrayUtil.swap(archive, i-1, select);
			/*
			  Saying temp = archive[i];
				archive[i] = archive[select];
				archive[select] = temp;
			*/
			
			}
		}

	public Saying[] getArchive() {
		return archive;
	}

	public Saying getSaying() {
		Saying saying = archive[index];
		index++; 
		//index %= archive.length; 모듈러연산 인덱스배열순환시 사용
		//if(index =0)
		//init();
		if(index == archive.length) {
			index = 0;
			init();
		}
		return saying;
	}
	
	public void print(PrintSaying ps ,Saying saying) {
		ps.print(saying);
	}
	
}


	
