package Ejercicio3;

public class Main {

	public static void main(String[]args) {
		
		Queue<Integer> cola = new Queue<Integer>();
		cola.offer(4);
		cola.offer(6);
		cola.offer(1);
		cola.offer(8);
		System.out.println(cola);
		System.out.println("Elemento que esta a la cabeza de la cola: " + cola.peek());
		System.out.println("Se elimino: " + cola.poll());
		System.out.println(cola);
		System.out.println("Elemento que esta a la cabeza de la cola: " + cola.peek());
		
	}
	
}
