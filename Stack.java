public class Stack {
	
	private Node top; 
    // Se crea una varible que almacena la suma de todos los elementos cuando se vayan ingresando
	private int size, suma;
	
    // Constructor para inicializar las varibles
	public Stack() {
		top = null;
		size = 0;
		suma = 0;
	}
	
    // Función que devuelve true si la pila esta vacía
	public boolean isEmpty() {
		return top == null;
	}
	
    // Función que devuelve la suma de los elementos de la pila
	public int getSuma() {
		return suma;
	}
	
    // Función para agregar elementos a la pila, los números no pueden ser negativos
	public void push(int data) {
		if(data >= 0) {
			if(isEmpty()) 
				top = new Node(data, null);
			else {
				Node aux = top;
				top = new Node(data, aux);
			}
			size++;
			suma = suma + data;
		}
		else
			System.out.println("No se puede ingresar numeros negativos");
	}
	
    // Función que elimina el último elemento de la pila y lo muestra en la consola
	public void pop() {
		if(isEmpty())
			System.out.println("No hay elementos para eliminar");
		else {
			System.out.println("Se elimino " + top.getData());
			suma = suma - top.getData();
			top = top.getNext();
			size--;
		}
	}
	
    // Función que compara la altura(suma) de tres pilas y va eliminando elementos de cada pila 
    // hasta que la altura de la tres sea igual, luego muestra la altura en la consola
	public int equalStacks(Stack h2, Stack h3) {
		while(this.getSuma()!=h2.getSuma() || h2.getSuma()!=h3.getSuma()) {
			Stack[] lista = order(this, h2, h3);
			while(lista[1].getSuma()>lista[0].getSuma() || lista[2].getSuma()>lista[0].getSuma()) {
				if(lista[1].getSuma()>lista[0].getSuma()) 
					lista[1].pop();
				if(lista[2].getSuma()>lista[0].getSuma()) 
					lista[2].pop();
			}
		}
		return suma;
	}
	
    // Función que devuelve un array, ordenado por el atributo suma, de tres pilas
	public Stack[] order(Stack h1, Stack h2, Stack h3) {
		Stack[] lista = {h1, h2, h3};
		for(int i=0; i<3; i++) {
			Stack aux = lista[i];
			int j = i - 1;
			while(j>=0 && lista[j].getSuma()>aux.getSuma()) {
				lista[j+1] = lista[j];
				j--;
			}
			lista[j+1] = aux;
		}
		return lista;
	}
	
    // Función para mostrar una pila en la consola
	public void print() {
		if(isEmpty())
			System.out.println("La pila esta vacia");
		else {
			Node aux = top;
			String str = "";
			for(int i=0; i<size; i++) {
				str = aux.getData() + " " + str;
				aux = aux.getNext();
			}
			System.out.println(str);
		}
	}

}
