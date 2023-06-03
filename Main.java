// Clase para probar correcto funcionamiento de la estructura de datos Stack 

public class Main {
	
	public static void main(String[]args) {
		
		Stack pila = new Stack();
		pila.push(1);
		pila.push(1);
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.print();
		Stack pila2 = new Stack();
		pila2.push(2);
		pila2.push(3);
		pila2.push(4);
		pila2.print();
		Stack pila3 = new Stack();
		pila3.push(1);
		pila3.push(4);
		pila3.push(1);
		pila3.push(1);
		pila3.print();

		System.out.println("Altura de las pilas: " + pila.equalStacks(pila2, pila3));
		
	}

}
