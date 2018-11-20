package carStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryManager {
	
	List<String> Categories;
	
	
	public CategoryManager() {
		Categories = new ArrayList<>();
	}
	
	public void addCategory(String cat) {
		Categories.add(cat);
	}
	
	public void addCategory() {
		Scanner scan = new Scanner(System.in);		
		System.out.print("categoria a ser adicionada:  ");
        String  cat  = scan.next();
		Categories.add(cat);
		scan.close();
	}
	
	public void removeCategory(String cat) {
		Categories.remove(cat);
	}
	
	public boolean checkIfCategoryExists(String cat) {
		return Categories.contains(cat);
	}

}
