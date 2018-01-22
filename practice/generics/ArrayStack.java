package practice.generics;

public class ArrayStack<E> implements Stack<E> {
	
	//for static memory must specify data type
	Object []data = new Object[10];
	private static int top=-1;

	@Override
	public E pop() {
		if(top==-1){
			System.out.println("Stack is Empty");
			return null;
		}
		E element = (E) data[top];
		top = top-1;
		return element;
	}

	@Override
	public void push(E element) {
		if(top==99){
			System.out.println("Stack is full");
			return;
		}
		top++;
		data[top] = element;
		
	}
	
	public void display(){
		
		for(int i=0;i<=top;i++){
			System.out.println(data[i]);
		}
		
	}

}
