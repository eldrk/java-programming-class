package chapter03;

public class Ex03_DenyLogicOperaor {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		for(int i=0;i<10;i++) {
		play = !play;
		System.out.println(play);
		}
	}
}
