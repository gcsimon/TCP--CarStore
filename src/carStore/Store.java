package carStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Store {
	
	List<Automobile> cars;
	List<Client> clients;
	CategoryManager categories;
	
	public Store(){
		cars = new ArrayList<>();
		categories = new CategoryManager();
		clients = new ArrayList<Client>();
		categories.addCategory("Lux");
		categories.addCategory("Premium");
		categories.addCategory("Popular");	
		
	}
	
	
	public void addAutomobile() {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual tipo de veiculo voce deseja inserir? ");
		System.out.println("1 para SUV ");
		System.out.println("2 para eletrico ");
		System.out.println("3 caminhonete ");
		System.out.println("4 para hatch ");
		System.out.println("5 para Sedan ");		
		System.out.println("0 sair ");
		int option = 0;
        option = scan.nextInt();
        
        if(option >= 0 && option <= 5 )
        {
        	System.out.print("Digite o ano: ");
	        int year = scan.nextInt();
        	
        	System.out.print("Digite o hp: ");
	        int hp = scan.nextInt();
        	
        	System.out.print("Digite o peso: ");
	        int weight = scan.nextInt();
        	
        	System.out.print("Digite o tamanho do tanque: ");
	        int tankSize = scan.nextInt();
        	
        	System.out.print("Digite a kilolmetragem: ");
	        long km = scan.nextLong();
        	
        	System.out.print("Digite o valor: ");
	        double value = scan.nextDouble();
        	
        	System.out.print("Digite o consumo urbano: ");
	        double urbanConsumption = scan.nextDouble();
        	
        	System.out.print("Digite o consumo rodoviario: ");
	        double roadConsumption = scan.nextDouble();  	
        	
        	System.out.print("Digite a placa: ");
	        String licensePlate = scan.next();
        	
        	System.out.print("Digite o modelo: ");
	        String model = scan.next();        	
        	
        	System.out.print("Digite a categoria: ");
	        String cat = scan.next();
        	
        	while(!this.categories.checkIfCategoryExists(cat)) {
            	System.out.print("Categoria inexistente. Digite a categoria: ");
    	        cat = scan.next();
        	}
        	
        	switch(option) {
        	case 1: 
            	System.out.print("Digite a altura do solo(cm): ");
    	        int groundHeight = scan.nextInt();            	
            	System.out.print("eh 4x4?  ");
    	        boolean fourByFour = scan.nextBoolean();    
    	        
            	this.cars.add(new SUV(year,km,weight,hp,value, urbanConsumption,roadConsumption,licensePlate,tankSize,model,cat,groundHeight,fourByFour));     		
        		break;
        		
        	case 2:
            	System.out.print("tempo de carga(horas):  ");
    	        double chargingTime  = scan.nextDouble();
    	        
    	        this.cars.add(new Eletric(year,km,weight,hp,value, urbanConsumption,roadConsumption,licensePlate,tankSize,model,cat,chargingTime)); 
        		break;
        		
        	case 3:
            	System.out.print("capacidade de carga:  ");
    	        int carryingCapacity  = scan.nextInt();
    	        this.cars.add(new Pickup(year,km,weight,hp,value, urbanConsumption,roadConsumption,licensePlate,tankSize,model,cat,carryingCapacity)); 
        		break;        		
        	case 4:
        		System.out.print("capacidade do porta-malas:  ");
    	        int luggageSize  = scan.nextInt();
    	        this.cars.add(new Hatch(year,km,weight,hp,value, urbanConsumption,roadConsumption,licensePlate,tankSize,model,cat,luggageSize)); 
        		break;
        	case 5:
        		System.out.print("capacidade do porta-malas:  ");
    	        luggageSize  = scan.nextInt();
    	        this.cars.add(new Sedan(year,km,weight,hp,value, urbanConsumption,roadConsumption,licensePlate,tankSize,model,cat,luggageSize)); 
        		break;
        	default: break;	
        	}
        }
        else
        	System.out.println("opcao invalida");
	}
	
	public void removeAutomobile() {
		Scanner scan = new Scanner(System.in);
		System.out.print("placa do automovel a ser removido:  ");
        String  licensePlate  = scan.next();
        List<Automobile> toRemove = new ArrayList<>();
        for(Automobile a : this.cars) {
        	if (a.getLicensePlate().equals(licensePlate))
        		toRemove.add(a);
        		System.out.println("HREEE");
        }        
        this.cars.removeAll(toRemove);
	}
	
	public void searchAutomobile() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("valor max:  ");
        double  maxValue  = scan.nextDouble();
		System.out.print("ano min:  ");
        int  maxYear  = scan.nextInt();
		System.out.print("ano km/l min:  ");
        double  kmPerLt  = scan.nextDouble();  
        
       
        for(Automobile auto : this.cars) {
        	if (auto.getValue() <= maxValue && auto.getYear() >= maxYear && auto.getRoadConsumption() >= kmPerLt)
        		System.out.println(auto.getLicensePlate());
        }        

	}
	
	public void checkValue() {
		Scanner scan = new Scanner(System.in);		
		System.out.print("placa: ");
        String  licensePlate  = scan.next();
        
        for(Automobile auto : this.cars) {
        	if (auto.getLicensePlate().equals(licensePlate))
        		System.out.println(auto.getValue());
        }
	}
	
	public void printCarRepository() {
		for(Automobile auto : this.cars)
			auto.info();
	}
	
	public void printClientRepository() {
		for(Client c : this.clients)
			c.info();
	}
	
	public void addClient() {
		Scanner scan = new Scanner(System.in);			
		System.out.println("Nome: ");
		String name= scan.next();
		System.out.println("CPF: ");
		String cpf= scan.next();
		System.out.println("Telefone: ");
		String telephone= scan.next();
		System.out.println("Categoria preferencial: ");
		String preferencialCategory= scan.next();		
		this.clients.add(new Client(name,cpf,telephone,preferencialCategory));
	}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);		
		int option = 0;
		
		
		System.out.print("Digite a opcao que deseja fazer ou 0 para sair ");
		System.out.println("1 para adicionar veiculo");
		System.out.println("2 para listar veiculos disponiveis");
		System.out.println("3 para checar valor de um veiculo");
		System.out.println("3 para adicionar um cliente");
		
        String  licensePlate  = scan.next();
	}
	
	
    public static void main(String[] args) {    	
    	Store st = new Store();
    	//st.addAutomobile(); 
    	//st.removeAutomobile();
    	st.cars.add(new SUV(2018,90000,1300,140,120000, 9,15.5,"ABC1511",52,"Tracker","Premium",12,false)); 
    	st.cars.add(new Sedan(2012,32000,1050,105,28000, 10.2,12.5,"IUH1515",52,"Logan","Popular",470)); 
    	st.cars.add(new Hatch(2012,30000,1050,105,22000, 10.2,12.5,"IUH1691",52,"spin","Premium",470)); 
    	st.cars.add(new Sedan(2012,26600,1120,105,150000, 6,9,"IUH1691",60,"BMW 320i","Premium",330)); 
    	
    	st.clients.add(new Client("Maria", "86598743534", "5233287054", "Popular")) ;
    	st.clients.add(new Client("Joao",  "53535353534", "5233520544", "Premium"));
    	st.clients.add(new Client("Jose",  "11559988553", "5133254054", "Premium"));
    	
    	st.addClient();
    	st.printClientRepository();
    	st.menu();
  	
    }
    
    

		
	}
	
	


