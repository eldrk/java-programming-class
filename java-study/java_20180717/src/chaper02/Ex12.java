package chaper02;

public class Ex12 {
	
	public static void printAlphabet(char alphabet) {
		for(int i=0;i<26;i++) {
			System.out.print((char)(alphabet+i));
		}
	}
	public static void main(String[] args) {

		printAlphabet('A');
		System.out.println();
		printAlphabet('a');
		}
		


}
