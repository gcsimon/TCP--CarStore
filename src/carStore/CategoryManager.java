package carStore;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	
	List<Category> Categories;
	
	
	public CategoryManager() {
		Categories = new ArrayList<>();
	}
	
	public void addCategory(Category cat) {
		Categories.add(cat);
	}
	
	public void removeCategory(Category cat) {
		Categories.remove(cat);
	}
	
	public boolean checkIfCategoryExists(Category cat) {
		return Categories.contains(cat);
	}

}
