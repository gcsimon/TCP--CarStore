package carStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("categoryManager")
/**
 * Classe respons�vel por gerenciar as categorias de autom�veis.
 * 
 *
 */
public class CategoryManager {
	
	List<String> Categories;
	
	
	public CategoryManager() {
		Categories = new ArrayList<>();
	}
	
	/**
	 * M�todo respons�vel por adicionar uma categoria.
	 * @param String categoria
	 *
	 */
	public void addCategory(String cat) {
		Categories.add(cat);
	}
	
	/**
	 * M�todo respons�vel por adicionar uma categoria.
	 *
	 *
	 */
	public void addCategory() {
		Scanner scan = new Scanner(System.in);		
		System.out.print("categoria a ser adicionada:  ");
        String  cat  = scan.next();
		Categories.add(cat);
		scan.close();
	}
	
	/**
	 * M�todo respons�vel por remover uma categoria.
	 *
	 *
	 */
	public void removeCategory(String cat) {
		Categories.remove(cat);
	}
	
	/**
	 * M�todo respons�vel por verificar se uma categoria j� existe.
	 * @return boolean 
	 *
	 */
	public boolean checkIfCategoryExists(String cat) {
		return Categories.contains(cat);
	}

}
