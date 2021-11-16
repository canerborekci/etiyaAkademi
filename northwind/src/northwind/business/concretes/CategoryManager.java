package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.CategoryService;
import northwind.dataAccess.abstracts.CategoryRepository;
import northwind.entities.concretes.Category;

public class CategoryManager implements CategoryService {

	private CategoryRepository categoryRepository;

	public CategoryManager(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository=categoryRepository;
	}

	@Override
	public List<Category> GetAll() {
		// TODO Auto-generated method stub
		return this.categoryRepository.getAll();
	}

	@Override
	public void add(Category category) {
		this.categoryRepository.add(category);

	}

}
