package chapter06;

class Stack{
	
	public final static int STACK_SIZE = 5;
	private Object[] stack;
	private int top;
	
	public Stack() {//return타입이 없다 void로 생성하지않는다
		stack = new Object[STACK_SIZE];
		top = -1;//스택이 비어있다
	}

	public Stack(int size) {
		stack = new Object[size];
		top = -1;
	}
	
	public void push(Object value) {//업캐스팅 다허용
		//Full상황인지 검사
		if(top == (stack.length)-1) {
			//현재길이의 2배길이를 가지는 새로운 배열생성
			Object[] newStack = new Object[stack.length*2];
			//이전 배열에서 새로운 배열로 데이터 복사
			System.arraycopy(stack, 0, newStack, 0, stack.length);
			//stack 변수가 새로운 배열로 참조하도록 함
			stack = newStack;
		}
		//데이터추가
		top++;
		stack[top] = value;
	}
	
	public Object pop() {
		//int value = 0; 데이터제거		
	
		Object value=stack[top];
		top--;
		
		return value;
	}
	
	public boolean isEmpty() {
			return top == -1;	
	}
}

public class Ex02_StackExample {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		for(int i=0;i<100;i++) {
			
		}
		
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
