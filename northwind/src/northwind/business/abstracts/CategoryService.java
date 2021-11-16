package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Category;

public interface CategoryService {
	List<Category> GetAll();
	void add(Category category);
}
