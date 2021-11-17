package northwind.business.concretes;


import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.core.utilities.results.DataResult;
import northwind.core.utilities.results.ErrorResult;
import northwind.core.utilities.results.Result;
import northwind.core.utilities.results.SuccessDataResult;
import northwind.core.utilities.results.SuccessResult;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;

	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productRepository.getAll());
	}


	@Override
	public Result add(Product product) {
		if(checkIfProductNameExist(product.getProductName()).isSuccess()) {
			this.productRepository.add(product);
			return new SuccessResult("ürün eklendi");
		}else {
			return new ErrorResult("ürün eklenmedi");
		}
		
		
		

	}
	
	
	private Result checkIfProductNameExist(String productName) {
		for(Product product : this.productRepository.getAll()) {
			if(productName==product.getProductName()) {
				return new Result(false,"Ürün ismi tekrar edemez.");
			}
		}return new SuccessResult();
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

//	public boolean checkCategoryCount(int categoryId) {
//		int count = 0;
//		for (Product product : this.productRepository(.g)) {
//			if (product.getCategoryId() == item.getCategoryId()) {
//				count++;
//			}
//			if (count >= 5) {
//				System.out.println("Aynı kategoriye ait en fazla 5 ürün bulunabilir!");
//				return false;
//			}
//		}
//		return true;
//	}



}
