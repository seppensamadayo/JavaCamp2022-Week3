package kodlamaIoNLayeredDemo.business;

import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.dataAccess.CategoryDao;
import kodlamaIoNLayeredDemo.entities.Category;

public class CategoryManager {
private CategoryDao categoryDao;
private Logger[] loggers;

public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
	super();
	this.categoryDao = categoryDao;
	 this.loggers = loggers;
	
}
public void add(Category category) throws Exception {
	Category[] categories= {new Category(1,"Tümü"),new Category(2,"Programlama")};
	for (Category c:categories ) {
		if(category.getName()==c.getName()) {
			throw new Exception("Kategori ismi tekrar edemez");
		}
	} categoryDao.add(category);
    for (Logger logger : loggers) {
        logger.log(category.getName());
}
}
}