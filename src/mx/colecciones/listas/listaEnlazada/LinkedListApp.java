package mx.colecciones.listas.listaEnlazada;

public class LinkedListApp {
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.push(1.28);
		list.push(3.28);
		list.push(9.28);
		list.printContent();
		
		Node nodo= list.insert(3.28, 79.3);
		if(nodo == null) {
			System.out.println("No se pudo insertar un nuevo nodo");
		}else {
			System.out.println("El nodo se ha insertado de manera correcta");
		}
		System.out.println("El nuevo nodo de la lista enlazada es: ");
		list.printContent();
		
		nodo = list.contains(1.28);
		if(nodo == null) {
			System.out.println("No se pudo insertar un nuevo nodo");
		}else {
			System.out.println("El valor se ha encontrado");
		}

		System.out.println("Eliminando nodo");
		while(!list.isEmpty()) {
			nodo = list.pop();
			System.out.println("Nodo eliminado");
			nodo.showContent();
		}
		list.printContent();
		
		list.push("Cat");
		list.push("Dog");
		
		list.printContent();
		
		list.delete("Cat");
		
		System.out.println("Lista despues de eliminado Cat");
		
		list.printContent();
		
	}
}
