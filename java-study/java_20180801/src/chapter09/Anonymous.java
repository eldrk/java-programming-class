package chapter09;

public class Anonymous {
	Person field = new Person(){
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			super.wake();
		}
	};
	
	void method1() {
		//지역변수로 익명객체 생성
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		//로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	

}
