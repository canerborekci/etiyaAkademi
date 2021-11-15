package logger;

public class ProductManager implements ProductService {
	private Logger[] loggers;

	public ProductManager(Logger[] loggers) {

		this.loggers = loggers;
	}

	@Override
	public void save(Product product) {
		System.out.println("Ürün eklendi. " + product.getName());
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}

	}

}
