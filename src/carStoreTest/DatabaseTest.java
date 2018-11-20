package carStoreTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import carStore.Automobile;
import carStore.Client;
import carStore.DataBase;
import carStore.Eletric;
import carStore.Hatch;
import carStore.Pickup;
import carStore.SUV;
import carStore.Sedan;

public class DatabaseTest {
	
	DataBase banco;
	Client client1; Client client2; Client client3; Client client4; Client client5; 
	Automobile car1;
	Eletric eletric;
	Hatch hatch;
	Sedan sedan;
	Pickup pickup;
	SUV suv;
	
	List<Client> clients = new ArrayList<Client>();
	List<Automobile> cars = new ArrayList<Automobile>();
	
	@Before
	public void setUp() throws Exception {
		
		banco = new DataBase("homolog"); 
		
		client1 = new Client("Herminea", "86598743534", "79423432", "Pickup");
		client2 = new Client("Olavo",    "86598743534", "23423423", "SUV");	
		client3 = new Client("Eustaquio","86595743534", "56845538", "Sedan");	
		client4 = new Client("Olivia",   "98698743534", "64356437", "SUV");	
		client5 = new Client("Robson",   "86654787476", "75567645", "Eletric");	
		
		eletric = new Eletric(2018,12000,1120,128,31000,30.1, 22.2, "ITD-2033", 38, "Prius", "Premium", 12);
		hatch   = new Hatch(2014,12000,1120,78,31000,10.1, 12.2, "ITD-2033", 38, "HB20", "Sport", 150);
		sedan   = new Sedan(2010,12000,1120,105,31000,10.1, 13.2, "ITD-2033", 55, "Focus", "LUX", 550);
		pickup = new Pickup(2014,12000,1120,135,31000,9.1, 13.7, "IKD-2079", 38, "Ranger", "Premium", 2500);
		suv = new SUV(2013,12000,1120,135,31000,9.1, 13.7, "IKD-2079", 38, "IX35", "Premium", 40, true);
	
		car1 = new Automobile(2012,12000,1120,78,31000,10.1, 12.2, "ITD-2033", 38, "Uno", "LUX");

		
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		clients.add(client4);
		clients.add(client5);
		
		cars.add(eletric);
		cars.add(hatch);
		cars.add(sedan);
		cars.add(pickup);
		cars.add(suv);
		
	
	}

	@Test
	public void TestSetClientesXML() {
        
		banco.setClientesXML(this.clients);
		
	
	}
	

	@Test
	public void TestGetClientesXML() {
		List<Client> clients2;
		clients2 = banco.getClientesXML();
		
		int i =0;
	for (Client clie : clients2) { 
		
		assertEquals(clie.getName() , clients.get(i).getName());
		assertEquals(clie.getCpf() , clients.get(i).getCpf());
		assertEquals(clie.getPreferencialCategory() , clients.get(i).getPreferencialCategory());
		assertEquals(clie.getTelephone() , clients.get(i).getTelephone());
		assertEquals(clie.getScore(car1) , clients.get(i).getScore(car1), 0.1);
		i++;
        
     }
	
		
	}
	
	@Test
	public void TestSetCarsXML() {
		
		banco.setCarsXML(cars);
	}
	
	@Test
	public void TestGetCarsXML() {
		List<Automobile> cars2;
		cars2 = banco.getCarsXML();
		
		int i =0;
	for (Automobile car : cars2) { 
		
		assertEquals(car.autonomia() , cars.get(i).autonomia(), 0.1);
        assertEquals(car.getClass(), cars.get(i).getClass());
        assertEquals(car.getHp(), cars.get(i).getHp());
        assertEquals(car.getLicensePlate(),cars.get(i).getLicensePlate());
        assertEquals(car.getValue(), cars.get(i).getValue(), 0.1);
        assertEquals(car.getTankSize(), cars.get(i).getTankSize());
		i++; 
       }
	
	}

}
