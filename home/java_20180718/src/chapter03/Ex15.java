package chapter03;

public class Ex15 {
	public static void main(String[] args) {
		
		int me = 2,com=0;
		//가위 0 바위1 보 2
		if(me ==1 && com ==0) {
			System.out.println("이김");
		}else if(me==1 && com ==2) {
			System.out.println("짐");
		}else if(me == com){
			System.out.println("비김");
		}
		
		if(me ==0 && com ==2) {
			System.out.println("이김");
		}else if(me==0 && com ==1) {
			System.out.println("짐");
		}
		
		if(me ==2 && com ==1) {
			System.out.println("이김");
		}else if(me==2 && com ==0) {
			System.out.println("짐");
		}
	}
}
