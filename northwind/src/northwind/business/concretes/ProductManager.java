package northwind.business.concretes;


import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;

	}

	@Override
	public List<Product> GetAll() {
		// TODO Auto-generated method stub
		return this.productRepository.getAll();
	}

	@Override
	public void add(Product product) {
		boolean verify = true;

		verify = checkProductName(product);
		verify = checkUnitPrice(product);
		verify = checkbyCategoryIdandUnitPrice(product);
		verify = checkCategoryCount(product);

		if (verify) {
			this.productRepository.add(product);
		}

	}

	public boolean checkProductName(Product product) {
		for (Product item : GetAll()) {
			if (item.getProductName() == product.getProductName()) {
				System.out.println("Aynı isim tekrar edemez.");
				return false;
			}
		}
		return true;
	}

	public boolean checkUnitPrice(Product product) {
		if (product.getUnitPrice() < 0) {
			System.out.println("Ürün fiyatı 0'dan küçük olamaz!");
			return false;
		}
		return true;
	}

	public boolean checkbyCategoryIdandUnitPrice(Product product) {
		if (product.getCategoryId() == 3 && product.getUnitPrice() < 10) {
			System.out.println("3. Kategoride fiyatlar 10'dan az olamaz!");
			return false;
		}
		return true;
	}

	public boolean checkCategoryCount(Product product) {
		int count = 0;
		for (Product item : GetAll()) {
			if (product.getCategoryId() == item.getCategoryId()) {
				count++;
			}
			if (count >= 5) {
				System.out.println("Aynı kategoriye ait en fazla 5 ürün bulunabilir!");
				return false;
			}
		}
		return true;
	}

}
