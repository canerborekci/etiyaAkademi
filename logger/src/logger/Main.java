package logger;

public class Main {

	public static void main(String[] args) {

		// Logger arrayin içine hangi logger class'ını koyarsak ona göre loglama işlemi
		// yapar.
		Logger[] loggers = { new DatabaseLogger(), new EmailLogger(), new FileLogger() };
		ProductManager productManager = new ProductManager(loggers);

		Product computer = new Product(1, "Lenova ideapad", "Laptop");

		productManager.save(computer);
	}

}
