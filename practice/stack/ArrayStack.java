package practice.stack;


public class ArrayStack {

	private static int[] stack = new int[1000];
	private static int top = -1;	

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i] + " ");
		}

	}

	public void pop() {
		//boundary case
		if(top == -1) {
			System.out.println("The stack is empty");
			return;
		}
		//top should decrement, previous last element
		//no longer accessible
		System.out.println("Removing this element: " + stack[top]);
		top = top-1;
	}

	public void push(int val) {
		//stack.length - 1 represents last index position
		if(top == stack.length - 1) {
			System.out.println("The stack is full");
			return;
		}
		top = top+1;
		stack[top] = val;
		
	}
	

}
