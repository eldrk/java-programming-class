package chapter07;
class People{
	public String name;
	public String ssn;
	
	public People() {}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public String ChangeName(String name) {
		this.name = name;
		return name;
	}
}

class Student extends People{
	public int StudentNo;
	
	public Student() {}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		StudentNo = studentNo;
	}
}

public class Ex05_Student {
	public static void main(String[] args) {
		Student student01 = new Student("홍길동","123456-1234567",1);
		System.out.println("name      : " +student01.name);
		System.out.println("ssn       : " +student01.ssn);
		System.out.println("studentNo : " +student01.StudentNo);
		System.out.println();
		
		Student student02 = new Student("정자바","745938-1234568",4);
		student02.ChangeName("최자바");
		System.out.println("name      : " +student02.name);
		System.out.println("ssn       : " +student02.ssn);
		System.out.println("studentNo : " +student02.StudentNo);
		System.out.println();

		
	}
}
