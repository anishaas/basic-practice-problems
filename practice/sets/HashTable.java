package practice.sets;

import java.util.Scanner;

public class HashTable {
	
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
	
	Node [] arr = new Node[100];
	
	
	public void insert(int val) {
		int index = val % 100;
		Node node = new Node();
		node.setData(val);
		Node temp = arr[index]; 
		//check for existing value
		if(arr[index] != null) {
			node.setNext(temp);
			arr[index] = node;			
		}
		arr[index] = node;
	}
	
	public void delete(int val) {
		int index = val % 100;
		//key itself not found.
		if(arr[index]==null){
			System.out.println("Element not found");
			return;
		}
		Node temp = arr[index];
		// only one element in that index(no chaining there)
		if(temp.getNext() == null) {
			if(temp.getData()==val)
			{
				arr[index] = null;
				System.out.println("Element deleted succesfully");
			}
			else{
				System.out.println("Element not found");
			}
			return;
		}
		
		// we are now here in the chaining case-- linked list now
		
		// delete at beginning
		if(temp.getData()==val)
		{
			arr[index] = temp.getNext();
			System.out.println("Element deleted succesfully");
			return;
		}
		
		boolean found = false;
		Node prev = temp;
		Node current = temp.getNext();
		// more than one elemnent exists in the chain and data is not in the first node.
		while(current != null) {
			
			if(current.getData()==val){
				prev.setNext(current.getNext());
				found = true;
				break;
			}
			prev = current;
			current = current.getNext();	
		}
		
		if(!found){
			System.out.println("Element not found");
			return;
		}
	
		System.out.println("Element deleted succesfully");		
	}
	
	//complete search
	public boolean search(int val) {
		int index = val % 100;
		if(arr[index] != null) {
			return true;
		}
		return false;
	}

}
