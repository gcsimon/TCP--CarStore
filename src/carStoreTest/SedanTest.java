package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import carStore.Sedan;

public class SedanTest {

	Sedan sedan;
    String category;
	

	@Before
	public void setUp() throws Exception {
		this.category = "Basico";
		sedan = new Sedan(2010,12000,1120,105,31000,10.1, 13.2, "ITD-2033", 55, "Focus", category, 550);
	}

	@Test
	public void testGetLuggageSize() {
		assertEquals(550,sedan.getLuggageSize());
	}
	
	@Test
	public void testSetLuggageSize() {
		sedan.setLuggageSize(250);
		assertEquals(250, sedan.getLuggageSize());
	}

	


	
	

}
