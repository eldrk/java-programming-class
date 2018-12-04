package chapter05;

import java.util.Scanner;

public class Ex15_RockPaperScissors {
	
	public static String toString(int what){
		String[] str = {"가위","바위","보"};
		return str[what];
		
/*		String str;
		switch(what) {
		case 0 :str = "가위";break;
		case 1 :str = "바위";break;
		default :str = "보";break;
		}
		return str;
		*/
	}

	public static void main(String[] args)throws Exception{

		System.out.println("가위, 바위, 보");
		System.out.print("선택 : ");
		//int ch = System.in.read();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Rocksp me = Rocksp.valueOf(input);
		//int me = ch-'0';
		
		int num = Random.rand(0, 3);
		Rocksp[] values = Rocksp.values();
		Rocksp com = values[num];
		//가위 0 바위1 보 2
		//System.out.print("가위 : 0 , 바위 : 1, 보: 2");
		
		System.out.println("나 : " +me+ " , "
	                     + "컴 : " +com);
		
		if(me == com) {
			System.out.println("비겼습니다");
		}else if((me == Rocksp.가위 && com == Rocksp.보) ||
				     (me == Rocksp.바위 && com == Rocksp.가위) ||
			       (me == Rocksp.보 && com == Rocksp.바위)) {
				System.out.println("이겼습니다");
		}else {
				System.out.println("졌습니다");
		}
		
	}
	
}


	/*	if(me==com) {
			System.out.println("비겼습니다.");
			return;
		}
	if(me ==0) {
		if(com ==1) {
				System.out.println("졌습니다");
		}else if (com == 2){
				System.out.println("이겼습니다");
			}
		}else if(me == 1) {
			if(com ==0) {
				System.out.println("졌습니다");
			}else if (com == 2){
				System.out.println("이겼습니다");
			}
		}else {
			if(com ==0) {
				System.out.println("졌습니다");
			}else if (com == 1){
				System.out.println("이겼습니다");
			}
		}
	 */