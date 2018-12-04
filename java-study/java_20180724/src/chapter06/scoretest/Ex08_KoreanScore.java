package chapter06.scoretest;

import java.util.Scanner;

class Score{
	String name;       // 이름
	String studentNo;	 // 국어점수
	int koreanScore;   // 학번
	
	Score(){}

	public Score(String name, String studentNo, int koreanScore) {
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	@Override
	public String toString() {//개발자 확인용
		return "Score : name= " + name + ", studentNo= " + studentNo + ", koreanScore= " + koreanScore ;
	}

	
}

public class Ex08_KoreanScore {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
	
		System.out.print("학생이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("학번을 입력하세요 : ");
		String studentNo = sc.nextLine();
		
		System.out.print("국어점수를 입력하세요 : ");
		int score = sc.nextInt();
		sc.nextLine(); //또는
		
		//score = Integer.parseInt(scanner.nextLine());
		
		Score st1 = new Score(name,studentNo,score);
		System.out.println(st1);
		
//		Score st2 = new Score("최자바","1999081457",78); 하드코딩
//		Score st3 = new Score("김자바","2011487964",56);

	}

}
