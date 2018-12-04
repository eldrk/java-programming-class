package chapter03;

import lib.BinaryUtil;//import 다른패키지에 있는 메소드 사용시 선언

public class Ex06_BitReverseOperator {
	public static void main(String[] args) {
		int v1 = 10;
		int	v2 = ~v1;
		int v3 = ~v1+1;
		BinaryUtil.printBinary(v1);
		BinaryUtil.printBinary(v2);
		BinaryUtil.printBinary(v3);
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4+1;
		BinaryUtil.printBinary(v4);
		BinaryUtil.printBinary(v5);
		BinaryUtil.printBinary(v6);
	}
	
}
