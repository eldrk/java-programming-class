package chaper02;

public class Ex07_CastingExample {
	public static void main(String[] args) {
		int intValue = 97;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 343384700;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 9.344314;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		}
	}

