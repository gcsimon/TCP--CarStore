package carStoreTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import carStore.CategoryManager;

public class CategoryManagerTest {

CategoryManager cm;
String cat1,cat2,cat3;
	
	@Before
	public void setUp() {
		cm = new CategoryManager();
		cat1 = "Lux";
		cat2 = "Premium";
		cat3 = "Popular";
	}
	
	@Test
	public void addCategoryTest() {
		cm.addCategory(this.cat1);
		assertTrue(cm.checkIfCategoryExists(cat1));
		
	}
	
	@Test
	public void removeCategoryTest() {
		cm.addCategory(this.cat1);
		cm.removeCategory(this.cat1);
		assertTrue(!cm.checkIfCategoryExists(cat1));
		
	}
	
	@Test
	public void addMultipleCategories() {
		cm.addCategory(this.cat1);
		cm.addCategory(this.cat2);
		cm.addCategory(this.cat3);
     	assertTrue(cm.checkIfCategoryExists(cat1));
		assertTrue(cm.checkIfCategoryExists(cat2));
		assertTrue(cm.checkIfCategoryExists(cat3));
	}	
	
}
