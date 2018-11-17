package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import carStore.Category;
import carStore.Sedan;

public class SedanTest {

	Sedan sedan;
	Category categoria;
	

	@Before
	public void setUp() throws Exception {
		categoria = new Category("Premium");
		sedan = new Sedan(320, categoria);
	}

	@Test
	public void testGetLuggageSize() {
		assertEquals(320,sedan.getLuggageSize());
	}

	@Test
	public void testSetLuggageSize() {
		sedan.setLuggageSize(400);
		assertEquals(400, sedan.getLuggageSize());
	}

	@Test
	public void testGetCategoria() {
		assertEquals("Premium", sedan.getCategoria());
	}

	
	

}
