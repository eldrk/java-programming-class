package chaper07;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.filed1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.filed2 = "data2";   불가능
//		parent.method3();          불가능
		
		if(parent instanceof Child) {
			//강제 타입 변환
		Child child = (Child)parent;
		child.filed2 = "yyy";
		child.method3();
		}else {
			System.out.println("강제 타입변경 불가");
		}
	}
}
