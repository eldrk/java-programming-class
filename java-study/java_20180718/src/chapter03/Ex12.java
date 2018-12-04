package chapter03;

public class Ex12 {
	
	public static void printAlphabet(char alphabet) {
		for(int i=0;i<26;i++) {
			System.out.print((char)(alphabet+i));
		}
	}
	
	//public static void 
	public static void main(String[] args) {
		lib.Decoration.printCharacter('#', 30);
		System.out.println("대문자 알파벳");
		lib.Decoration.printCharacter('#', 30);
		printAlphabet('A');
		
		System.out.println();
		lib.Decoration.printCharacter('#', 30);
		System.out.println("소문자 알파벳");
		lib.Decoration.printCharacter('#', 30);
		printAlphabet('a');
		
		
		}
		


}
