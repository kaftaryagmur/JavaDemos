<<<<<<< HEAD
package reCapDemo12;

public class Main {

	public static void main(String[] args) {

		ProductManager manager = new ProductManager();
		Product product= new Product();
		
		product.name="Mouse";
		product.price=10;
		
		manager.add(product);

		
		DatabaseHelper.Crud.Delete();
	}

}
=======
package reCapDemo12;

public class Main {

	public static void main(String[] args) {

		ProductManager manager = new ProductManager();
		Product product= new Product();
		
		product.name="Mouse";
		product.price=10;
		
		manager.add(product);

		
		DatabaseHelper.Crud.Delete();
	}

}
>>>>>>> 6a6f35683c30af64c6c69cbae018cdcd82d307c2
