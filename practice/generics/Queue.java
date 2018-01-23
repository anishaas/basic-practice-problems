package practice.generics;

public interface Queue<E> {
	
	void enqueue(E element);
	
	E dequeue();

}
