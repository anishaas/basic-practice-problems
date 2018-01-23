package practice.generics;

public class ArrayQueue<E> implements Queue<E> {
	
	//for an array must specify size
	Object[] data = new Object[100];
	int front = -1;
	int rear = -1;

	@Override
	public void enqueue(E element) {
		//empty array
		if(rear==data.length-1) {
			System.out.println("The queue is full");
			return;
		}
		
		//first insert, increment front
		if(front==-1){
			front++;
		}
		
		data[rear+1] = element;
		rear++;
	}
	
	@Override
	public E dequeue() {
		if(front==-1) {
			System.out.println("The queue is empty");
			return null;
		}
		//reached end of queue
		if(front==rear){
			front=-1;
			rear=-1;
		}
		//cast element to generic type
		E removed = (E)data[front];
		front++; 
		return removed;
	}
	
}
