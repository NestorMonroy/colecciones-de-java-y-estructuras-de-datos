package mx.colecciones.listas.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		//Creacion de arrayList
		List<String> listaColores = new ArrayList<>();
		//Creacion mediante la clase Arrays
		String [] nombres = {"Nombre1", "Nombre2", "Nombre3"};
		
		List<String> listaNombres = Arrays.asList(nombres);
		
		//Adiccion de elementos individuales
		listaColores.add("Color1");
		listaColores.add("Color2");
		listaColores.add("Color3");
		
		//Contruir lista apartir de otra lista
		List<String> elementos = new ArrayList<>(listaColores);
		
		//Adicion de elementos a otra coleccion.
		//Con addAll se puede agregar toda una nueva lista
		elementos.addAll(listaNombres);
		
		System.out.println("Lista Nombres");
		listaNombres.forEach(System.out::println);
	
		System.out.println("Lista Colores");
		listaColores.forEach(System.out::println);
	
		System.out.println("Lista Elementos");
		elementos.forEach(System.out::println);
		//Iteracion a traves del ArrayList
		ListIterator<String> iterador = listaColores.listIterator();
	
		System.out.println("\n\nRecorrido del iterador");
		while(iterador.hasNext()) {
			System.out.println("Color: " + iterador.next());
		}
		
		System.out.println("\n\nRecorrido inverso del iterador");
		while(iterador.hasPrevious()) {
			System.out.println("Color: " + iterador.previous());
		}
		
		while(iterador.hasNext()) {
			if(iterador.next().equals("Color2")) {
				iterador.remove();
			}
		}
		
		System.out.println("\n\nRecorrido sin Color2");
		for(ListIterator<String> iter = listaColores.listIterator(); iter.hasNext();) {
			System.out.println("Color " + iter.next());
		}
		

		
		//Convertir en Array
		//Insertar elemento en una posicion aleatorea
	}
}
