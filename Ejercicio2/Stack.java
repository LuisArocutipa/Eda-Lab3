package Ejercicio2;

public class Stack<T> {
	
	private Node<T> top;
	private int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	public boolean empty() {
		return top == null;
	}
	
	public T push(T item) {
		if(empty()) 
			top = new Node<T>(item, null);
		else {
			Node<T> aux = top;
			top = new Node<T>(item, aux);
		}
		size++;
		return item;
	}
	
	public T pop() {
		if(empty())
			return null;
		else {
			T data = top.getData();
			top = top.getNext();
			size--;
			return data;
		}
	}
	
	public T peek() {
		return top.getData();
	}
	
	public int search(Object o) {
		if(empty())
			return -1;
		else {
			int index = 1;
			Node<T> aux = top;
			for(int i=0; i<size; i++) {
				if(aux.getData().equals(o))
					return index;
				aux = aux.getNext();
				index++;
			}
			return -1;
		}
	}
	
	public String toString() {
		String str = "";
		if(empty())
			return str;
		else {
			Node<T> aux = top;
			for(int i=0; i<size; i++) {
				str = aux.getData() + " " + str;
				aux = aux.getNext();
			}
			return str;
		}
	}

}
