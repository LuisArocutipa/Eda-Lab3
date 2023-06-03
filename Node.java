// Clase no genérica ya que no es necesario

public class Node {

	private Node next;
	private int data;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}