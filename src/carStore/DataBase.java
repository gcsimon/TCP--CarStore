package carStore;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	String arquivoClient;
	String arquivoAutomobile;
	
	private DataBase(){
		
	}
	
	public DataBase(String banco){
		
		if(banco == "homolog")
		{ 
			this.arquivoClient = "TestClients.xml";
		    this.arquivoAutomobile = "TestCars.xml";
		}
		
	    else 
	    {
		    this.arquivoClient = "Clients.xml";
	        this.arquivoAutomobile = "Cars.xml";
	    }
	}

	
	public void setClientesXML(List<Client> clients) {
		
        XStream xStream = new XStream();
        xStream.alias("client", Client.class);
      /* String xml = xStream.toXML(client);
        System.out.print("XML = ");
        System.out.println(xml);  
       */ 
        File arquivo = new File(this.arquivoClient);
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(clients).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
       } }
        
	

	
        public List<Client> getClientesXML() {
        	 List<Client> clients = new ArrayList<Client>();
        	 List<Client> clients2 = new ArrayList<Client>();
        	
        	 try {
   
                XStream xStream = new XStream(new Dom4JDriver());
                xStream.alias("client", Client.class);
                xStream.processAnnotations(Client.class);
     
                BufferedReader input = new BufferedReader(new FileReader(this.arquivoClient));
                
                clients = (List<Client>) xStream.fromXML(input);
                input.close();
     

            } catch (IOException ex) {      
                ex.printStackTrace();
            }
        	
        	return clients;
        }
        
        
        
        public void setCarsXML(List<Automobile> cars) {
    		
            XStream xStream = new XStream();
            xStream.alias("automobile", Automobile.class);
          /* String xml = xStream.toXML(client);
            System.out.print("XML = ");
            System.out.println(xml);  
           */ 
            File arquivo = new File(this.arquivoAutomobile);
            FileOutputStream gravar;
            try {
                gravar = new FileOutputStream(arquivo);
                gravar.write(xStream.toXML(cars).getBytes());
                gravar.close();
            } catch (IOException ex) {
                ex.printStackTrace();
           } }
        
        public List<Automobile> getCarsXML() {
       	 List<Automobile> cars = new ArrayList<Automobile>();
   
       	
       	 try {
  
               XStream xStream = new XStream(new Dom4JDriver());
               xStream.alias("automobile", Automobile.class);
               xStream.processAnnotations(Automobile.class);
    
               BufferedReader input = new BufferedReader(new FileReader(this.arquivoAutomobile));
               
               cars = (List<Automobile>) xStream.fromXML(input);
               input.close();
    

           } catch (IOException ex) {      
               ex.printStackTrace();
           }
       	
       	return cars;
       }

    }
	
	
  

	

