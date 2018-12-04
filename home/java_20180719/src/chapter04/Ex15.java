package chapter04;

import lib.Random;

public class Ex15 {
	
	public static String toString(int what){
		String str;
		switch(what) {
		case 0 :str = "가위";break;
		case 1 :str = "바위";break;
		default :str = "보";break;
		}
		return str;
	}
	
	public static void main(String[] args)throws Exception{


		int ch = System.in.read();
		int me = ch-'0';
		
		
		int com = Random.rand(0, 3);
		//가위 0 바위1 보 2
		//System.out.print("가위 : 0 , 바위 : 1, 보: 2");
		System.out.println("나 : " +toString(me)+ " , "
	                     + "컴 : " +toString(com));
		
	if(me==com) {
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
		
/*		if(me == com) {
			System.out.println("비겼습니다");
			if((me == 0 && com == 2) ||
				     (me == 1 && com == 2) ||
			       (me == 2 && com == 1)) {
			System.out.println("이겼습니다");
			}else {
				System.out.println("졌습니다");
			}*/
		}
	}

