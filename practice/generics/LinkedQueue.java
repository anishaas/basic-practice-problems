package practice.generics;

public class LinkedQueue<E> implements Queue<E> {

	class Node<E> {
		
		E data;
		Node<E> next;
		
		public E getData() {
			return data;
		}
		public void setData(E data) {
			this.data = data;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}	
	}
	
	Node<E> head;
	Node<E> rear;

	@Override
	public void enqueue(E element) {
		if(head==null) {
			head.setData(element);
			return;
		}
		
		Node<E> e = new Node<E>();
		e.setData(element);
		
		//case only head element
		if(rear==null) {
			rear=e;
			head.setNext(rear);
		}
		
		//store old rear
		Node<E> temp=rear;
		temp.setNext(e);
		rear=e;
	}

	@Override
	public E dequeue() {
		if(head==null) {
			System.out.println("Queue is empty");
			return null;
		}
		
		//reached last element
		if(head==rear) {
			//if this is a generic method, why can't I return a Node<E> object?
			return head.getData();
		}
		
		//at least one more node
		Node<E> temp = head;
		head=head.getNext();
		return temp.getData();
	}
}
