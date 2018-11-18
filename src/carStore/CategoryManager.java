package carStore;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	
	List<String> Categories;
	
	
	public CategoryManager() {
		Categories = new ArrayList<>();
	}
	
	public void addCategory(String cat) {
		Categories.add(cat);
	}
	
	public void removeCategory(String cat) {
		Categories.remove(cat);
	}
	
	public boolean checkIfCategoryExists(String cat) {
		return Categories.contains(cat);
	}

}
