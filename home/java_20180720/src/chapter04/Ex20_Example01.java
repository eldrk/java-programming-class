package chapter04;


public class Ex20_Example01 {
	public static void main(String[] args) {
		System.out.println("========== 좌표 ==========");
		int num = (int)(Math.random()*25);
		int selectX = num/5;
		int selectY = num%5;
		System.out.println("번호 : " +num);
		for(int x=0;x<=4;x++) {
			for(int y=0;y<=4;y++) {
				if(selectX == x && selectY == y ) {
					System.out.print("[" +x+ ","+y+ "]");
				}else {
					System.out.print("(" +x+ ","+y+ ")");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
