package northwind;

import northwind.business.abstracts.ProductService;
import northwind.business.concretes.CategoryManager;
import northwind.business.concretes.EmployeeManager;
import northwind.business.concretes.ProductManager;
import northwind.dataAccess.concretes.CategoryDao;
import northwind.dataAccess.concretes.EmployeeDao;
import northwind.dataAccess.concretes.ProductDao;
import northwind.entities.concretes.Category;
import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new ProductDao());
		productService.add(new Product(1, 1, "Samsung", 10));
		productService.add(new Product(2, 1, "Samsung", 20));
		productService.add(new Product(3, 1, "Lenovo", 30));
		productService.add(new Product(4, 1, "Casper", 40));
	
		
		for (Product product : productService.getAll().getData()) {
			System.out.println(product.getProductName());
		}

	
	}

}
