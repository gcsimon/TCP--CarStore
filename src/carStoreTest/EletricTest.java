package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import carStore.Eletric;

public class EletricTest {

	String category;
	Eletric eletric;
	
	@Before
	public void setUp() throws Exception {
		this.category = "Premium";
		eletric = new Eletric(2018,12000,1120,128,31000,30.1, 22.2, "ITD-2033", 38, "Prius", category, 12);
	}


	@Test
	public void testGetChargingTime() {
		assertEquals(12.0, eletric.getChargingTime(), 0.1);
		
	}
	
	@Test
	public void testSetChargingTime() {
		eletric.setChargingTime(9.0);
		assertEquals(9.0, eletric.getChargingTime(), 0.1);
	}




}
