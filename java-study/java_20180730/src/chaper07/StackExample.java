package chaper07;

public class StackExample {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
//		for(int i=0;i<100;i++) {
//			
//		}
		
		int value = (int)stack.pop();
		System.out.println(value);
		value = (int)stack.pop();
		System.out.println(value);	
		value = (int)stack.pop();
		System.out.println(value);
		value = (int)stack.pop();
		System.out.println(value);
		value = (int)stack.pop();
		System.out.println(value);
		
		if(stack.isEmpty()) {
			System.out.println("스택이 비었습니다");
		}else {
			value = (int)stack.pop();
			System.out.println(value);
		}
		
	}
}
