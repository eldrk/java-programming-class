package chapter07;

class Parent{
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent{

	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	
	
	
}

public class Ex01_ParentChild {
	
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3();
		
		child.method1();
		child.method2();
		child.method3();
	}

}