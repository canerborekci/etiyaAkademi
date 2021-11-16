package northwind;

import northwind.business.abstracts.CategoryService;
import northwind.business.abstracts.EmployeeService;
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
		productService.add(new Product(2, 1, "Huawei", 20));
		productService.add(new Product(3, 1, "Lenovo", 30));
		productService.add(new Product(4, 1, "Casper", 40));
		productService.add(new Product(5, 1, "Dell", 50));
		productService.add(new Product(6, 1, "Apple", 50));
		productService.add(new Product(7, 1, "Vestel", 50));
		productService.add(new Product(8, 3, "Regal", 15));
		productService.add(new Product(9, 2, "Regal", -5));
		for (Product product : productService.GetAll()) {
			System.out.println(product.getProductName());
		}

		CategoryService categoryService = new CategoryManager(new CategoryDao());
		categoryService.add(new Category(1, "Telephone"));

		for (Category category : categoryService.GetAll()) {
			System.out.println(category.getCategoryName());
		}

		EmployeeService employeeService = new EmployeeManager(new EmployeeDao());
		employeeService.add(new Employee(1, "Anil", "Arslan", "Ä°stanbul"));

		for (Employee employee : employeeService.GetAll()) {
			System.out.println(employee.getFirstName());
		}

	}

}
