package carStore;

import java.util.Scanner;

public class Client {

	private String name;
	private String cpf;
	private String telephone;
	private String preferencialCategory;
	
	Client(){}
	
	public Client(String name, String cpf, String telephone, String preferencialCategory){
		this.name = name;
		this.cpf = cpf;
		this.telephone = telephone;
		this.setPreferencialCategory(preferencialCategory);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf.length()==11)
		   this.cpf = cpf;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public double getScore(Automobile auto) {
		double score=0;
		
		System.out.println(auto.getClass().getSimpleName().toString());
		System.out.println(this.getPreferencialCategory().toString());
		if(auto.getCategory().equals(this.getPreferencialCategory().toString())) {
			if(auto.getValue() < 20000)
				score=10;
			else if(auto.getValue() < 25000)
				score = 9;
			else if(auto.getValue() < 35000)
				score = 7.5;
			else if(auto.getValue() < 50000)
				score = 6;			
		}
		else if 
			(auto.getValue() < 20000)
				score=5;
			else if(auto.getValue() < 25000)
				score = 3;
			else if(auto.getValue() < 35000)
				score = 2;
			else 
				score = 1;				
		
		return score;
	}
	
	public void info() {
		System.out.println("Nome: " + this.getName());
		System.out.println("Telefone: " + this.getTelephone());
		System.out.println("Categoria preferencial: " + this.getPreferencialCategory());
		System.out.println("--------------------------");
	}


	public String getPreferencialCategory() {
		return preferencialCategory;
	}

	public void setPreferencialCategory(String preferencialCategory) {
		this.preferencialCategory = preferencialCategory;
	}
}
