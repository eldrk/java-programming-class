package chapter11;

public class FileNameTestExample {
	public static void main(String[] args) {
		String fileName = "HAHAHA.mp3";
		String testName = fileName.toLowerCase();
		
		if(testName.endsWith(".Mp3")) {
			System.out.println(testName);
		}else {
			System.out.println("mp3 파일이 아닙니다.");
		}
	}

}
