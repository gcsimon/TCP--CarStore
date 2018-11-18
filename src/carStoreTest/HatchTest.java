package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import carStore.Hatch;

public class HatchTest {

	Hatch hatch;
	String category;
	

	@Before
	public void setUp() throws Exception {
		this.category = "Basico";
		hatch = new Hatch(2014,12000,1120,78,31000,10.1, 12.2, "ITD-2033", 38, "HB20", category, 150);
	}

	@Test
	public void testGetLuggageSize() {
		assertEquals(150,hatch.getLuggageSize());
	}
	
	@Test
	public void testSetLuggageSize() {
		hatch.setLuggageSize(250);
		assertEquals(250, hatch.getLuggageSize());
	}



	


}
