package chapter04;

import lib.Random;

public class Ex11_TimesTable {
	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			System.out.println("=====" +i+ "단======");
			for(int j=2;j<=9;j++) {
				System.out.printf("%d x %d = %d%n",i,j,(i*j));
			}
			System.out.println();
		}
		
		/*int num = 2;
		for(int i=2;i<=9;i++) {
			int result = num*i;
			System.out.println(num + "X" +i+ "=" +result);
		}*/
		
		//int ran=Random.rand(5, 125);
		for(int k=0;k<10;k++) {
		
		
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=5;i>0;i--) {
				for(int j=i;j>0;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}	
	}
}
