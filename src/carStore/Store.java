package carStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale.Category;
import java.util.Random;
import java.util.Scanner;

public class Store {
	
	List<Automobile> cars;
	List<Client> clients;
	CategoryManager categories;
	Scanner scan = new Scanner(System.in);
	
	public Store(List<Automobile> cars, List<Client> clients, CategoryManager categories){
		this.cars = cars;
		this.categories = categories;
		this.clients = clients;	
	}
	
	public void addKm() {
		 		
		System.out.print("placa do automovel a ser aumentada a km:  ");
        String  licensePlate  = scan.next();
        for(Automobile a : this.cars) {
        	if (a.getLicensePlate().toString().equals(licensePlate)) {
        		System.out.print("km a serem adicionados:  ");
                long  km  = scan.nextLong();
        		a.setKm(a.getKm() + km);
        		System.out.println("Ve�culo atualizado");
        	}
        }   
         
	}
	
	
	public void addAutomobile() {		
		 
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
            	System.out.println("Categoria inexistente. ");
            	System.out.print("Categorias existentes: ");
            	for (String category : this.categories.Categories ) { 
            		  System.out.print(category + ", ");
            	}
            	System.out.print("\nDigite a categoria: ");
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
		 
		System.out.print("placa do automovel a ser vendido:  ");
        String  licensePlate  = scan.next();
        List<Automobile> toRemove = new ArrayList<>();
        for(Automobile a : this.cars) {
        	if (a.getLicensePlate().equals(licensePlate))
        		toRemove.add(a);
        }        
        this.cars.removeAll(toRemove);
         
        this.printCarRepository();
	}
	
	public void removeClient() {
		 
		System.out.print("nome do cliente a ser removido:  ");
        String  name  = scan.next();
        List<Client> toRemove = new ArrayList<>();
        for(Client a : this.clients) {
        	if (a.getName().equals(name))
        		toRemove.add(a);
        }        
        this.clients.removeAll(toRemove);
         
	}
	
	public void searchAutomobile() {
		 
		
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
	
	public void recommendAutomobile() { 
		Random rand = new Random();
    	int n = rand.nextInt(this.cars.size());        
    	this.cars.get(n).info();

	}
	
	
	
	public void menu() {
		 		
		int option = 1;			
		
		while(option != 0) {
			System.out.println("Digite a opcao que deseja fazer ou 0 para sair ");
					
			System.out.println("1 para adicionar veiculo");
			System.out.println("2 para listar veiculos disponiveis");
			System.out.println("3 para checar valor de um veiculo");
			System.out.println("4 para adicionar um cliente");
			System.out.println("5 para remover um cliente");
			System.out.println("6 para adicionar uma categoria");
			System.out.println("7 para listar os clientes");
			System.out.println("8 para procurar um carro a partir de valor maximo, ano minimo e km/l min");
			System.out.println("9 para vender veiculo");
			System.out.println("10 para indicar veiculo para cliente");
			option=scan.nextInt();	
			if(option == 1)
				this.addAutomobile();
			else if (option == 2) 
				this.printCarRepository();
			else if (option == 3)
				this.checkValue();
			else if (option == 4)
				this.addClient();
			else if (option == 5)
				this.removeClient();
			else if (option == 6)
				this.categories.addCategory();
			else if (option == 7)
				this.printClientRepository();
			else if (option == 8)
				this.searchAutomobile();
			else if (option == 9)
				this.removeAutomobile();
			else if (option == 10)
				this.recommendAutomobile();
			System.out.println("");
			System.out.println("");
			
		}  
	
	}
	
	
    public static void main(String[] args) {    	
    	DataBase db = new DataBase("aplication"); 
    	Store st = new Store(db.getCarsXML(), db.getClientesXML(),db.getCategoryManagerXML());
    	   	
    	st.menu();
    	   	
    	//Guarda os dados do estoque na base de dados antes de encerrar
    	db.setCarsXML(st.cars);
    	db.setClientesXML(st.clients);
  	    db.setCategorysXML(st.categories);  	    
    }
    
    

		
	}
	
	


