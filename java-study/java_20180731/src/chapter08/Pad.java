package chapter08;

public class Pad implements Searchable{

	@Override
	public void search(String url) {
		System.out.println("Pad로 " + url + "을 검색합니다.");
		
	}

}
