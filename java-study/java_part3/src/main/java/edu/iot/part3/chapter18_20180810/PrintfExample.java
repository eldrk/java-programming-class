package edu.iot.part3.chapter18_20180810;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class PrintfExample {
	public static void main(String[] args) {
		
		try(
				PrintWriter pw = new PrintWriter(new FileWriter("c:/temp/tes.txt"));
			){
			
			pw.printf("상품의 가격 : %d원%n",123);
			pw.printf("상품의 가격 : %6d원%n",123);
			pw.printf("상품의 가격 : %-6d원%n",123);
			pw.printf("상품의 가격 : %06d원%n",123);
			
			pw.printf("반지름이 %d인 원의 넓이 : %10.2f%n",10,Math.PI*10*10);
			
			pw.printf("%6d | %-10s | %10s\n", 1,"홍길동","도적");
			
			Date now = new Date();
			pw.printf("오늘은 %tY년 %tm월 %td일 입니다%n", now,now,now);
			pw.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다%n", now);
			pw.printf("현재 %1$tH시 %1$tM분 %1$tS초 입니다%n", now);
			
			}catch(Exception e){
				e.printStackTrace();
			}
		
		
		
		
		
		
	}
}
