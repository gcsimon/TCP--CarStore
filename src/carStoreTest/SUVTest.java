package carStoreTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import carStore.Category;
import carStore.SUV;

public class SUVTest {

	Category categoria;
	SUV suv;
	
	@Before
	public void setUp() {
	    categoria = new Category("Premium");
		suv = new SUV(40, true, categoria ); // SUV(int ground height, boolean fourByFour, Category categoria)
	}

	@Test
	public void SUV() {
		
		assertEquals(40 , suv.getGroundheight());
		assertEquals(true, suv.isFourByFour());
		assertEquals("Premium", suv.getCategoria());
	}
	
	@Test
	public void GetGroundheight() {
	    suv.setGroundheight(50);
        assertEquals(50, suv.getGroundheight());
        }
	
	@Test
	public void GetisFourByFour() {
	    suv.setFourByFour(false);
        assertEquals(false, suv.isFourByFour());
        }
}
