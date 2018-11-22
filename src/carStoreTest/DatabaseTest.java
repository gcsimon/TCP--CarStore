package carStoreTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.junit.Before;
import org.junit.Test;

import carStore.Automobile;
import carStore.CategoryManager;
import carStore.Client;
import carStore.DataBase;
import carStore.Eletric;
import carStore.Hatch;
import carStore.Pickup;
import carStore.SUV;
import carStore.Sedan;


public class DatabaseTest {
	
	DataBase banco;
	CategoryManager categoryManager;
	Client client1; Client client2; Client client3; Client client4; Client client5; 
	Automobile car1;
	Eletric eletric;
	Hatch hatch;
	Sedan sedan;
	Pickup pickup;
	SUV suv;
	
	List<Client> clients;
	List<Automobile> cars ;
	List<String> categoryList;
	
	@Before
	public void setUp() throws Exception {
		
		banco = new DataBase("test"); 
		categoryManager = new CategoryManager();
		
		clients = new ArrayList<Client>();
		cars = new ArrayList<Automobile>();
		categoryList = new ArrayList<String>();

		client1 = new Client("Herminea", "07525951554", "79423432", "PREMIUM");
		client2 = new Client("Olavo",    "29659464867", "23423423", "SPORT");	
		client3 = new Client("Eustaquio","86595748654", "56845538", "OFFROAD");	
		client4 = new Client("Olivia",   "98698743534", "64356437", "BASIC");	
		client5 = new Client("Robson",   "86654787476", "89565684", "LUX");	
		
		eletric = new Eletric(2018,12000,1120,128,31000,30.1, 22.2, "IUD-2033", 38, "Prius", "PREMIUM", 12);
		hatch   = new Hatch(2014,12000,1120,78,31000,10.1, 12.2, "IYH-2863", 38, "HB20", "SPORT", 150);
		sedan   = new Sedan(2010,12000,1120,105,31000,10.1, 13.2, "ITR-9537", 55, "Focus", "LUX", 550);
		pickup = new Pickup(2014,12000,1120,135,31000,9.1, 13.7, "IKD-6079", 38, "Ranger", "PREMIUM", 2500);
		suv = new SUV(2013,12000,1120,135,31000,9.1, 13.7, "IKD-2089", 38, "IX35", "PREMIUM", 40, true);
	
		car1 = new Automobile(2012,12000,1120,78,31000,10.1, 12.2, "ITD-2073", 38, "Uno", "LUX");
	
		
		categoryList.add("LUX");
		categoryList.add("PREMIUM");
		categoryList.add("SPORT");
		categoryList.add("OFFROAD");
		categoryList.add("BASIC");
		
		for (String cat : categoryList) { 
			
			categoryManager.addCategory(cat);
		}
		
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
		
		banco.setClientesXML(clients);
		banco.setCategorysXML(categoryManager);
		banco.setCarsXML(cars);
	
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
	public void TestSetClientesXML() {
        
		clients.clear();
		client1 = new Client("Leonardo", "87486686884", "99596265", "Pickup");
		client2 = new Client("Fabiana",  "99565956865", "89562625", "SUV");	
		client3 = new Client("Mauricio", "32565595475", "12326565", "Eletric");	
		
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		
		banco.setClientesXML(this.clients);
		
		
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
	
	
	@Test
	public void TestSetCarsXML() {
		List<Automobile> cars2;
		
		cars.clear();
		cars.add(hatch);
		cars.add(sedan);
		banco.setCarsXML(cars);
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
	
	
	
	@Test
	public void TestGetCategoryXML() {
		
		categoryManager = banco.getCategoryManagerXML();
		
		for (String cat : categoryList) 
		{ 
		    assertTrue( categoryManager.checkIfCategoryExists(cat));
		}
		     
     }
	
	@Test
	public void TestSetCategoryesXML() {
       
		categoryList.clear();
		categoryList.add("BASIC");
		categoryList.add("OFFROAD");
		categoryList.add("PREMIUM");
		categoryList.add("LUX");
		
	
        
		categoryManager = new CategoryManager(); 
		
		for (String cat : categoryList) 
		{ 
		     categoryManager.addCategory(cat);
		}
		
		banco.setCategorysXML(categoryManager);
		
		
		categoryManager = banco.getCategoryManagerXML();
		
		for (String cat : categoryList) 
		{ 
		    assertTrue( categoryManager.checkIfCategoryExists(cat));
		}
		 
     }
	
	}


