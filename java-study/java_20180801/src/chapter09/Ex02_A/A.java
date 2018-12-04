package chapter09.Ex02_A;

public class A {
	class B{}
	static class C{}
	
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적필드 초기화
	//static B filed3 = new B();
	static C filed4 = new C();
	
	//정적 메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}

}
