package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import carStore.Category;
import carStore.Eletric;

public class EletricTest {

	Category categoria;
	Eletric eletric;
	
	@Before
	public void setUp() throws Exception {
		categoria = new Category("Basico");
		eletric = new Eletric(10.0, categoria);
	}


	@Test
	public void testGetChargingTime() {
		assertEquals(10.0, eletric.getChargingTime(), 0.1);
		
	}

	@Test
	public void testSetChargingTime() {
		eletric.setChargingTime(9.0);
		assertEquals(9.0, eletric.getChargingTime(), 0.1);
	}

	@Test
	public void testGetCategoria() {
    assertEquals("Basico", eletric.getCategoria());
    }



}
