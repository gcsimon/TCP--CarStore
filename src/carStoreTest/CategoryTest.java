package carStoreTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import carStore.Category;

public class CategoryTest {

	Category cat;
	
	@Before
	public void setUp() {
		cat = new Category("Basic");
	}

	@Test
	public void getTypevehicleTest() {
		assertEquals("Basic", cat.getTypevehicle());
		
	}

	@Test
	public void setTypevehicleTest() {
		cat.setTypevehicle("Premium");
		assertEquals( cat.getTypevehicle(),"Premium");
		
	}
}
