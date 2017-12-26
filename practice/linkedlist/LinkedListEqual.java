package practice.linkedlist;

import practice.linkedlist.CustomerLinkedList.Node;

public class LinkedListEqual {

	public static void main(String[] args) {
		
	}
	
	//future: check for null pointers
	public boolean hasLoop(Node head) {
		if(head == null) return false;
		Node slow = head;
		Node fast = head.getNext();
		while(fast != null && slow != null) {
			if(fast == slow) {
				return true;
			}
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return false;
	}
	
	public boolean isBothEqual(Node headA, Node headB) {
		boolean same = true;
		//check for nulls
		if(headA==null || headB==null) {
			System.out.println("One list is empty");
			return false;
		}
		//iterate through both lists and compare
		Node tempA = headA;
		Node tempB = headB;
		while(tempA != null && tempB !=null) {
			if(tempA.getData() != tempB.getData()) {
				return false;
			}
			tempA = tempA.getNext();
			tempB = tempB.getNext();
		}
		//at this point if either one is not null, return false
		if(tempA != null || tempB != null) {
			same = false;
		}
		return true;
	}

}
