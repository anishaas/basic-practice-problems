package practice.stack;

public class LinkedStack {
	
	private Node top;
	
	class Node {
		
		int data; 
		Node next;
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

	public void push(int val) {
		Node n = new Node();
		n.data = val;
		if(top == null) {
			top = n;
			return;
		}	
		n.setNext(top);
		top = n;
	}
	
	public void pop() {
		if(top==null){
			System.out.println("Stack is Empty");
			return;
		}
		int temp = top.getData();
		System.out.println("The element that got popped off is "+temp);
		top = top.getNext();
	}
	
	public void display() {
		if(top==null) {
			System.out.println("Stack is empty");
			return;
		}
		
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
