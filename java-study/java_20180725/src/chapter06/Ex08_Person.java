package chapter06;

class Person{
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}	
}

public class Ex08_Person {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; final을 사용하여 read만 가능하다
//		p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
	}
}
