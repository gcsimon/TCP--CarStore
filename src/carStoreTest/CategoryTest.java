package carStoreTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import carStore.Category;

public class CategoryTest {

	Category categoria;
	
	@Before
	public void setUp() {
		categoria = new Category("Basic");
	}

	@Test
	public void getTypevehicleTest() {
		assertEquals("Basic", categoria.getTypevehicle());
		
		
	}
}
