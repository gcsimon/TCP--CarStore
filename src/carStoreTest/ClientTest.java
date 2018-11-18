package carStoreTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import carStore.Automobile;
import carStore.Client;
import carStore.Pickup;

public class ClientTest {

	Client client;
	String category;
	Automobile automobile;
	
	@Before
	public void setUp() throws Exception {
		client = new Client("Maria", "86598743534", "5233287054");
		automobile =  new Pickup(2014,12000,1120,135,31000,9.1, 13.7, "IKD-2079", 38, "Ranger", category, 2500);
	}

	@Test
	public void testGetName() {
		assertEquals("Maria", this.client.getName());
	}

	@Test
	public void testSetName() {
		this.client.setName("Jorge");
		assertEquals("Jorge",this.client.getName());
	}

	@Test
	public void testGetCpf() {
		assertEquals( "86598743534" , this.client.getCpf());
	}

	@Test
	public void testSetCpf() {
		this.client.setCpf("8756534f4537490843"); //Mais de 11 digitos
		assertEquals("86598743534", this.client.getCpf());
		
		this.client.setCpf("5453"); //Menos de 11 digitos
		assertEquals("86598743534", this.client.getCpf());
		
		this.client.setCpf("86798054676"); //11 digitos
		assertEquals("86798054676", this.client.getCpf());
		
		
	}

	@Test
	public void testGetTelephone() {
		assertEquals("5233287054", this.client.getTelephone());
	}

	@Test
	public void testSetTelephone() {
	  this.client.setTelephone("51998541232");
	  assertEquals("51998541232", this.client.getTelephone());
	}
	
	@Test
	public void testGetScore() {
		double score = this.client.getScore();
		assertTrue(score>0);
		assertTrue(score<10);
	
	}
     
	
	@Test
	public void testAvaliaCarro() {
		fail("Not yet implemented");

	}


}