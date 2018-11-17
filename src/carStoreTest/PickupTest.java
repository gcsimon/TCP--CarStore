package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import carStore.Category;
import carStore.Pickup;

public class PickupTest {

	Pickup pickup;
	 Category category;
	 
	@Before
	public void setUp() throws Exception {
	
		pickup = new Pickup(2014,12000,1120,135,31000,9.1, 13.7, "IKD-2079", 38, "Ranger", category, 2500);
		
	}

	@Test
	public void testGetCarryingCapacity() {	
		assertEquals(2500, pickup.getCarryingCapacity());
	}
	
	@Test
	public void testSetCarryingCapacity() {
		pickup.setCarryingCapacity(1500);
		assertEquals(1500, pickup.getCarryingCapacity());
	}
	

}


