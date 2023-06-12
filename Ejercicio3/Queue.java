package Ejercicio3;

public class Queue<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	
	public Queue() {
		first = null;
		last = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void offer(T item) {
		if(isEmpty()) {
			first = new Node<T>(item, null);
			last = first;
		}
		else {
			last.setNext(new Node<T>(item, null));
			last = last.getNext();
		}
		size++;
	}
	
	public T peek() {
		return first.getData();
	}
	
	public T poll() {
		if(isEmpty())
			return null;
		else {
			T data = first.getData();
			first = first.getNext();
			size--;
			return data;
		}
	}
	
	public String toString() {
		String str = "";
		if(isEmpty())
			return str;
		else {
			Node<T> aux = first;
			for(int i=0; i<size; i++) {
				str = str + aux.getData() + " ";
				aux = aux.getNext();
			}
			return str;
		}
	}
	
}
