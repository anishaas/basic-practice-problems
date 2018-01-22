package practice.generics;

public class LinkedStack<E> implements Stack<E> {
	
	class Node<E> {
		E data;
		Node next;
		
		

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	
	Node<E> head;

	@Override
	public E pop() {
		if(head==null) {
			System.out.println("List is empty");
			return null;
		}
		Node<E> temp = head;
		head = head.getNext();
		return temp.getData();
	}

	@Override
	public void push(E element) {
		Node<E> n = new Node<E>();
		n.setData(element);
		n.setNext(head);
		head = n;
	}
	
	public void display() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}
