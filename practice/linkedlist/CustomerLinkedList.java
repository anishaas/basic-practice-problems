package practice.linkedlist;

public class CustomerLinkedList {
	
	private Node head;
	private Node last;
	private int size; 
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//Node subclass
	class Node {
		
		Node(Customer cust) {
			this.data = cust;
		}
		
		private Customer data;
		private Node next;
		
		//to access pointers
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Customer getData() {
			return data;
		}
		public void setData(Customer data) {
			this.data = data;
		}		
		
	}
	
	public void reverse() {
		if(head == null || head.getNext()==null) {
			return;
		} 
		
		Node temp = head.getNext();
		if(temp.getNext()==null){
			temp.setNext(head);
			head.setNext(null);
			return;
		}
		Node firstNode = head;
		Node prev = head;
		Node current = prev.getNext();
		Node next = current.getNext();
		while (current!= null) {
			System.out.println("loop entered");
			current.setNext(prev);
			prev = current;
			current = next;
			if(current!=null){
			next = current.getNext();
			}
		}
		
		head = prev;
		firstNode.setNext(null);
		
		System.out.println("loop exited");
	}
	
	public void deleteAtBeginning() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.getNext();
		size--;
	}
	
	public void deleteAtPos(int pos) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(pos == 1) {
			deleteAtBeginning();
			return;
		}
		
		if(pos == size) {
			deleteAtLast();
			return;
		}
		
		Node temp = head;
		for(int i = 1; i < pos; i++) {
			if(i == pos - 1) {
				temp.setNext(temp.getNext().getNext());
				break;
			}
			temp = temp.getNext();
		}
		size--;
	}
	
	public void deleteAtLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		//iterate up to size - 1 and set last
		Node temp = head;
		for(int i = 1; i < size; i++) {
			if(i == size - 1) {
				last = temp;
			}
			temp = temp.getNext();
		}
		size--;
	}
	
	public void insertAtBeginning(Customer cust) {
		//create new node
		Node myNode = new Node(cust);
		
		//empty list
		if(head == null) {
			head = myNode; 
			last = myNode;
			size++;
			return;
		}
		//non-empty list, insert front of existing head
		myNode.setNext(head);
		head = myNode; 
		size++;
	}
	
	public void insertAtPos(Customer cust, int pos) {
		if(head == null) {
			insertAtBeginning(cust);
			return;
		}
		
		//position == size + 1 
		if(pos == size + 1) {
			insertAtLast(cust);
			return;
		}
				
		//create new node
		Node myNode = new Node(cust);
		
		//need to iterate and find node left to pos and reassign pointers
		Node temp = head;
		for(int i = 1; i < pos; i++) {
			if(i == pos - 1) {
				myNode.setNext(temp.getNext());
				temp.setNext(myNode);
			}
			temp = temp.getNext();
		}
		size++;
	}
	
	public void insertAtLast(Customer cust) {
		//create new node
		Node myNode = new Node(cust);
		
		last.setNext(myNode);
		last = myNode;
		size++;
	}
	
	public void display() {
		Node temp = head;
		for(int i = 1; i <= size; i++) {
			System.out.println("Customer's id is: " + temp.getData().getId() + " Customer's name is: "
			+ temp.getData().getName() + " Customer's phone number is: " + temp.getData().getPhoneNumber());
		temp = temp.getNext();
		}
	}

}
