package practice.queue;

public class LinkedListQueue {
	
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

	private Node front;
	private Node rear;
	
	public void enqueue(int val) {
		Node n = new Node();
		n.setData(val);
		
		//case empty queue
		if(front == null) {
			front = n;
			rear = n;
			return;
		}
		//else set rear's next to node
		rear.setNext(n);
		rear = n;
	}
	
	public void dequeue() {
		if(front==null) {
			System.out.println("The queue is empty");
			return;
		}
		if(front==rear){
			front = null;
			rear = null;
			return;
		}
		System.out.println("The element that got deleted is "+front.getData());
		front = front.getNext();		
	}
	
	public void display() {
		if(front==null) {
			System.out.println("Queue is empty");
		}
		Node temp = front;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
