package chapter06;
class Student{
	
}

public class Ex04_StudentExample {
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1변수가 Student 객체를 참조합니다");
		
		Student s2 = new Student();
		System.out.println("s2변수가 또다른 Student객체를 참조합니다");
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		
		s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		
	}
}
