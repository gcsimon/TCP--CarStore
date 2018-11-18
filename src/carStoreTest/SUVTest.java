package carStoreTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import carStore.SUV;


public class SUVTest {


	SUV suv;
	String category;
	
	@Before
	public void setUp() {

		this.category = "Basico";
		suv = new SUV(2013,12000,1120,135,31000,9.1, 13.7, "IKD-2079", 38, "IX35", category, 40, true);
	}
	
	@Test
	public void getGroundheight() {
        assertEquals(40, suv.getGroundheight());
        }
	
	@Test
	public void getisFourByFour() {
        assertEquals(true, suv.isFourByFour());
        }
	
	@Test
	public void setGroundheight() {
		this.suv.setGroundheight(50);
		assertEquals(50, suv.getGroundheight());
	}
	
	@Test
	public void setisFourByFour() {
		this.suv.setFourByFour(false);
		 assertEquals(false, suv.isFourByFour());
	}
	

}
