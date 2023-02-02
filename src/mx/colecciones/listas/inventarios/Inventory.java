package mx.colecciones.listas.inventarios;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Product> products = new LinkedList<>();
	
	public void newProduct(int ID, String name, int existence, Double price) {
		Product newProduct = new Product(ID,name, existence, price);
		
		boolean succes = products.add(newProduct);
		
		if(succes) {
			System.out.println("El producto " + name + "se agrego correctamente");
		}else {
			System.out.println("Ocurrio un problema con el ");
		}
	}
	
	public void printProducts() {
		System.out.println("Relacion de productos en almacen");
		products.forEach(System.out::println);
		System.out.println("\n");
	}
	
	public void addProduct(int ID) {
		int productIndex = products.indexOf(new Product(ID));
		Product product = products.get(productIndex);
		int existenceTemp = product.getExistence();
		int newExistence = existenceTemp +=1;
		product.setExistence(newExistence);
		System.out.println("\n Se agegro un producto " + product.getName()+" exitosa");
	}

	public void updateProductPrice(int ID, double precio) {
		int productIndex = products.indexOf(new Product(ID));
		Product product = products.get(productIndex);
		product.setPrice(precio);
		System.out.println("\n Se actualizo el precio");
	}

	public void deleteProduct(int ID) {
		int productIndex = products.indexOf(new Product(ID));
		Product deleteProduct = products.remove(productIndex);
		
		if(deleteProduct != null) {
			System.out.println("El producto " + deleteProduct + "se ha eliminado");
		}else {
			System.out.println("No fue posible eliminar el producto");
		}
		
		
	}

}
