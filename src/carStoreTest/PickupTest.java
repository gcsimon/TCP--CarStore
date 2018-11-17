package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import carStore.Category;
import carStore.Pickup;

public class PickupTest {

	Category categoria;
	Pickup pickup;
	@Before
	public void setUp() throws Exception {
		categoria = new Category("OffRoad");
		pickup = new Pickup(2000, categoria);
	}

	@Test
	public void testGetCarryingCapacity() {
		assertEquals(2000, pickup.getCarryingCapacity());
	}

	@Test
	public void testSetCarryingCapacity() {
		pickup.setCarryingCapacity(1500);
		assertEquals(1500, pickup.getCarryingCapacity());
	}

	@Test
	public void testGetCategoria() {
		assertEquals("OffRoad", pickup.getCategoria());
	}

}
