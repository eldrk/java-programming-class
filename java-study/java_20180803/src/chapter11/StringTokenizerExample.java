package chapter11;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		
		//excel을 단순텍스트 파일로 저장하는 파일csv파일을 불러서 쪼갤때 사용
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		String data = "name=홍길동&age=20&password=123";
		
		StringTokenizer st1 = new StringTokenizer(data,"&");
		
		while(st1.hasMoreElements()) {
			String token = st.nextToken();
			String[] t = token.split("=");
			String key = t[0];
			String value = t[1];
			
			String setter = "set"+
						key.substring(0, 1).toUpperCase()+
						key.substring(1);
			
			System.out.println(key + ":" + value + "->" +setter);
		}
	}

}
