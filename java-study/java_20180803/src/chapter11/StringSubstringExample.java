package chapter11;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "787878-1212121";
		int loc = ssn.indexOf("-");
		String firstNum = ssn.substring(0,6);
	
		String secondNum = ssn.substring(7);

		
		if(loc !=-1) {
			firstNum = ssn.substring(0,loc);
			System.out.println(firstNum);
			
			secondNum = ssn.substring(loc+1);
			System.out.println(secondNum);		
		}
		
		//파일다룰때 쓰이는 기법 문자열을 찾아서 그문자열을 기준으로 앞뒤로 출력
		String fileName = "misson.impossible.mp4";
		int loc2= fileName.lastIndexOf(".");
		
		if(loc2 != -1) {
			String thirdNum = fileName.substring(0,loc2);
			System.out.println("파일명 : " +thirdNum);
		
			String fourthNum = fileName.substring(loc2+1);
			System.out.println("파일유형 : "+fourthNum);
		}
	}
}
