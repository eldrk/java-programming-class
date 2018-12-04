package chapter11;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "정우성&우성,정우성,정우성-우성";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
