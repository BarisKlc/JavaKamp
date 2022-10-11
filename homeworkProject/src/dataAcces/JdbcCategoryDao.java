package dataAcces;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori Jdbc ile eklendi : "+ category.getCategoryName());
		
	}

}
