package mx.colecciones.listas.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
/* Una tienda de ropa ha dejado de vender una serie de productos de cierta marca que tiene bien
 * identificador en una lista, sin embargo, en su base de datos siguen apareciendo en las busquedas
 * porque no han sido eliminadas. No queremos tener que borrar una por una, asi que se necesita crear un programa
 * que en base a una lista de marcas, revise si estas prendas se encuentran en la base de datos y si es el caso que se eliminen.
 * */ 
import java.util.List;
import java.util.ListIterator;

public class EliminarProductos {


	public static Producto[] obtenerProductos() {
		Producto[] productos = { 
				new Producto("H&M", "Gris", "Pay", "32L"), 
				new Producto("H&M", "Verde", "Pay", "32L"),
				new Producto("Zara", "Gris", "Pay", "32L"), 
				new Producto("Lacoste", "Verde", "Pay", "32L"),
				new Producto("Farm", "Azul", "Pay", "32L"), 
				new Producto("Ho", "Gris", "Pay", "32L"),
				new Producto("H&M", "Gris", "Pay", "32L")
		};

		return productos;
	}

	public static void main(String[] args) {
		String [] marcas = {"H&M", "Lacoste"};
		
		List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
		productos.forEach(System.out::println);
		
		//eliminarMarcasIterator(productos, Arrays.asList(marcas));
		
		eliminarMarcasStream(productos, Arrays.asList(marcas));
		System.out.println("\n\nMarcas eliminadas");
		productos.forEach(System.out::println);
		
	}
	
	private static void eliminarMarcasStream(List<Producto> productos, List<String> marcas) {
		productos.removeIf((producto) -> marcas.contains(producto.getMarca()));
	}

	private static void eliminarMarcasIterator(List<Producto> productos, List<String> marcas) {
		for(ListIterator<Producto> iterator = productos.listIterator(); iterator.hasNext();) {
			if(marcas.contains(iterator.next().getMarca())) {
				iterator.remove();
			}
		}
	}
	
	static class Producto {
		private String marca;
		private String color;
		private String modelo;
		private String talla;

		public Producto(String marca, String color, String modelo, String talla) {
			super();
			this.marca = marca;
			this.color = color;
			this.modelo = modelo;
			this.talla = talla;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getTalla() {
			return talla;
		}

		public void setTalla(String talla) {
			this.talla = talla;
		}

		@Override
		public String toString() {
			return "Producto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", talla=" + talla + "]";
		}

	}

}
