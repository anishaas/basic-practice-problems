package practice.strings;

public class StringHashing {
	
	class Node {
		String data;
		Node next;
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
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
	private static int TABLE_SIZE = 100;
	
	private static int hash(String val) {
		int sum = 0;
		int multiplier = 1;
		int index = -1;
		for(int i = 0; i < val.length(); i++) {
			sum = sum + (multiplier * val.charAt(i));
			multiplier++;
		}
		index = sum % TABLE_SIZE;
		return index;
	}
	
	public void display() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.print(arr[i].getData() + " ");
				if(arr[i].getNext() != null) {
					while(arr[i].getNext() != null) {
						System.out.print(arr[i].getData() + " ");
						arr[i] = arr[i].getNext();
					}
				}
			}
		}
	}
	
	public void insert(String val) {
		int index = hash(val);
		Node node = new Node();
		node.setData(val);
		Node temp = arr[index]; 
		//check for existing value
		if(arr[index] != null) {
			if(arr[index].getData().equals(val)){
				return;
			}
			node.setNext(temp);
			arr[index] = node;			
		}
		arr[index] = node;
	}
	
	public void delete(String val) {
		int index = hash(val);
		//key itself not found.
		if(arr[index]==null){
			System.out.println("Element not found");
			return;
		}
		Node temp = arr[index];
		// only one element in that index(no chaining there)
		if(temp.getNext() == null) {
			if(temp.getData().equals(val))
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
		if(temp.getData().equals(val))
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
			
			if(current.getData().equals(val)){
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
	
	public boolean search(String val) {
		int index = hash(val);
		//case null at index
		if(arr[index] == null) {
			return false;
		}
		
		//case linked list at index, must traverse list
		Node temp = arr[index];
		while(temp != null) {
			if(temp.getData().equals(val)) {
				return true;
			} 
			temp = temp.getNext();
		}
		return false;
	}
}
