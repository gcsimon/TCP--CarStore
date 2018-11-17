package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import carStore.Category;
import carStore.Hatch;
import carStore.Sedan;

public class HatchTest {

	Hatch hatch;
	Category categoria;
	

	@Before
	public void setUp() throws Exception {
		categoria = new Category("Sport");
		hatch = new Hatch(200, categoria);
	}

	@Test
	public void testGetLuggageSize() {
		assertEquals(200,hatch.getLuggageSize());
	}

	@Test
	public void testSetLuggageSize() {
		hatch.setLuggageSize(150);
		assertEquals(150, hatch.getLuggageSize());
	}

	@Test
	public void testGetCategoria() {
		assertEquals("Sport", hatch.getCategoria());
	}

}
