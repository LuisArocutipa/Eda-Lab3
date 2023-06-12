package Ejercicio2;

public class Main {
	
	public static void main(String[]args) {
		
		Stack<Integer> pila = new Stack<Integer>();
		pila.push(4);
		pila.push(1);
		pila.push(8);
		pila.push(7);
		System.out.println(pila);
		System.out.println("Elemento que esta en la parte superior de la pila: " + pila.peek());
		System.out.println("Se elimino: " + pila.pop());
		System.out.println(pila);
		System.out.println("Elemento que esta en la parte superior de la pila: " + pila.peek());
		System.out.println(pila);
		System.out.println("Posicion de 4: " + pila.search(4));
		System.out.println("Posicion de 8: " + pila.search(8));
		System.out.println("Posicion de 3: " + pila.search(3));
		
	}

}
