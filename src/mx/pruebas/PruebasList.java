package mx.pruebas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PruebasList {

	public static void main(String[] args) {
		List<Persona> listaArray = new ArrayList<>();
		List<Persona> listaLinked = new LinkedList<>();
		long antes;
		/*
		 * Tiempoo invertido en insertar una persona en listaArray (nanoSegundos)
			458200
			Tiempoo invertido en insertar una persona en listaLinked (nanoSegundos)
			12200
		 * */
		for(int i=0;i<1000000;i++) {
			listaArray.add(new Persona(i,"Persona"+i,i));
			listaLinked.add(new Persona(i,"Persona"+i,i));
		}
		
		System.out.println("Tiempo invertido en insertar una persona en listaArray (nanoSegundos)");
		antes = System.nanoTime();
		listaArray.add(1000000, new Persona(10001,"Persona", 1001));
		System.out.println(System.nanoTime()-antes);
		
		System.out.println("Tiempo invertido en insertar una persona en listaLinked (nanoSegundos)");
		antes = System.nanoTime();
		listaLinked.add(1000000, new Persona(10001,"Persona", 1001));
		System.out.println(System.nanoTime()-antes);
	}

	static class Persona{
		int idPersona;
		String nombre;
		int altura;
		
		public Persona(int idPersona, String nombre, int altura) {
			super();
			this.idPersona = idPersona;
			this.nombre = nombre;
			this.altura = altura;
		}
		
	}
}
