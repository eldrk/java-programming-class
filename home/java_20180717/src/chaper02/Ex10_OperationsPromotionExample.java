package chaper02;

public class Ex10_OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2= 20;
		byte byteValue3 = (byte)(byteValue1 + byteValue2);
		int intvalue1 = byteValue1+ byteValue2;
		System.out.println(intvalue1);
	
		char charValue1 = 'A';
		char charValue2 = 1;
		
		int intValue2 = charValue1+charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		char charValue3 =(char)(charValue1+charValue2);
		System.out.println(charValue3);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		float floatValue6 = 10/(float)4.0;
		double doubleValue = intValue5/4.0;
		System.out.println(floatValue6);
		System.out.println(doubleValue);
		
		double doubleValue2 =(double)intValue5 / 4;
		System.out.println(doubleValue2);
	}
}
