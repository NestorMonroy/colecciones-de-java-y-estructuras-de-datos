package mx.colecciones.listas.listaEnlazada;

public class Node {
	private Object data;
	private Node next;

	public Node(Object dato) {
		this.data = dato;
	}
	
	//Devuelve el valor del nodo
	public Object value() {
		return this.data;
	}
	//Devuelve la referencia al siguiente nodo
	public Node next() {
		return this.next;
	}
	//Establece cual es el nodo siguiente (nodo referenciado)
	public void setNext(Node next) {
		this.next = next;
	}
	//Imprime el valor del nodo
	public void showContent() {
		System.out.println("Value: "+ data);
	}
}
