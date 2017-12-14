package practice.classes;

public class EmployeeStack {
	
	private int top = -1;
	private Employee[] empStack = new Employee[1000];
	
	public int display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(empStack[i] + " ");
		}
		return 0;
	}

	public Employee pop() {
		//boundary case
		if(top == -1) {
			return null;
		}
		Employee temp = empStack[top];
		top = top-1;
		//top should decrement, previous last element
		//no longer accessible
		return temp;
	}

	public void push(Employee emp) {
		//stack.length - 1 represents last index position
		if(top == empStack.length - 1) {
			System.out.println("The stack is full");
			return;
		}
		top = top+1;
		empStack[top] = emp;
		
	}

}
