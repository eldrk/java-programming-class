package chapter06;

	class Stack{
	
	public final static int STACK_SIZE = 5;
	private int[] stack;
	private int top;
	
	public Stack() {//return타입이 없다 void로 생성하지않는다
		stack = new int[STACK_SIZE];
		top = -1;//스택이 비어있다
	}

	public Stack(int size) {
		stack = new int[size];
		top = -1;
	}
	
	public boolean push(int value) {
		//Full상황인지 검사
		if(top == (stack.length)-1) {
			return false;
		}
		//데이터추가
		top++;
		stack[top] = value;
		return true;
	}
	
	public int pop() {
		int value = 0;
		
		value=stack[top];
		top--;
		
		return value;
	}
	
	public boolean isEmpty() {
			return top == -1;	
	}
}

public class Ex09_StackExample {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(30);
		stack.push(20);
		stack.push(10);
		stack.push(-10);
		stack.push(-40);
		if(!stack.push(100)) {
			System.out.println("스택 오버플로우");
		}
		
		int value = stack.pop();
		System.out.println(value);
		value = stack.pop();
		System.out.println(value);	
		value = stack.pop();
		System.out.println(value);
		value = stack.pop();
		System.out.println(value);
		value = stack.pop();
		System.out.println(value);
		
		if(stack.isEmpty()) {
			System.out.println("스택이 비었습니다");
		}else {
			value = stack.pop();
			System.out.println(value);
		}
		
	}
}
