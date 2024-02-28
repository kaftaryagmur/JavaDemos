package reCapDemo12;

public class ProductValidator {
	static {
		System.out.println("Static yapıcı blok calisti");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok calisi");
	}
	public static boolean isValid(Product product) {
		//static yapi: new'lenemez
		//bir metod static yapildiginde sinif ismiyle direkt  cagirilir
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		return false;
	}

}
