package business;

import java.util.ArrayList;

import dataAcces.CategoryDao;
import entities.Category;
import logging.BaseLogger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private BaseLogger[] loggers;
	private ArrayList<String> categoryNames = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) {
		if (categoryNames.size()==0) {
			categoryNames.add(category.getCategoryName());
			categoryDao.add(category);
			for (BaseLogger logger : loggers) {
				logger.log(category.getCategoryName());
			}
		}else {
			categoryDao.add(category);
			for (BaseLogger logger:loggers) {
				logger.log(category.getCategoryName());
			}
			for (String c : categoryNames) {
				if(c.equals(category.getCategoryName())) {
					System.out.println("Bu kategori ismi mevcut : "+ c);
				}else {
					categoryDao.add(category);
					for(BaseLogger logger: loggers) {
						logger.log(category.getCategoryName());
					}
				}
			}
		}
	}

}
