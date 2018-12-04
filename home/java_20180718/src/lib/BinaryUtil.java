package lib;

public class BinaryUtil {
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0"+str;
		}
		return str;
	}

public static void printBinary(int vlaue) {
	System.out.println(toBinaryString(vlaue) 
										+ "(십진수: " +vlaue+ ")");
}	

}
