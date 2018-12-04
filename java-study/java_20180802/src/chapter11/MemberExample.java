package chapter11;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());//참조값 메모리주소
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다");
		}else {
			System.out.println("obj1과 onj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다");
		}else {
			System.out.println("obj1과 onj3은 동등하지 않습니다.");
		}
	}

}
