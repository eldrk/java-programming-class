package chapter04;


public class Ex18_BreakOutter {
	public static void main(String[] args) {
		for(char upper = 'A';upper<='Z';upper++) {
			System.out.println("===" +upper+ "===");
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper + "-" + lower);
				//System.out.println();
				if(lower =='o' ) {
					break;
				}
			}
		}
		System.out.println("프로그램 실행종료");
	}
}
