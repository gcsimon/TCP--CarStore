package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import carStore.Automobile;
import carStore.Category;

public class AutomobileTest {
	Automobile car = new Automobile();
	Category category;
	
	@Before
	public void setUp() {
		category = new Category("Basic");
		car = new Automobile(2012,12000,1120,78,31000,10.1, 12.2, "ITD-2033", 38, "Uno", category);
	}
	
	
	@Test
	public void andarKmTest() {
		long initialKm = this.car.getKm();
		this.car.andarKm(200);
		assertEquals(initialKm + 200, this.car.getKm());	
	}
	
	@Test
	public void autonomiaTest() {
		assertEquals(this.car.autonomia(), 423.7, 0.1);
	}
	
	@Test
	public void costSimulationTest() {
		assertEquals(this.car.costSimulation(4.85, 60), 28.8, 0.1);
	}
	
	@Test
	public void getModelTest() {
		assertEquals(this.car.getModel(), "Uno");
	}
	
	@Test
	public void getLicensePlateTest() {
		assertEquals(this.car.getLicensePlate(), "ITD-2033");
	}
	
	@Test
	public void getValueTest() {
		assertEquals(this.car.getValue(), 31000, 0.1);
	}
	
	@Test
	public void getHpTest() {
		assertEquals(this.car.getHp(), 78);
	}
	
	@Test
	public void getWeightTest() {
		assertEquals(this.car.getWeight(), 1120);
	}
	
	@Test
	public void getYearTest() {
		assertEquals(this.car.getYear(), 2012);
	}
	
	@Test
	public void getCategoryTest() {
		assertEquals(this.car.getCategory(), category);
	}
	
	@Test
	public void setCategoryTest() {
		Category category2 = new Category("Sport");
		this.car.setCategory(category2);
		assertEquals(this.car.getCategory(), category2 );
	}
	
	
	
	
	
	
	
	
	

}
