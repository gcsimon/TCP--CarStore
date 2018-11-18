package carStore;

import java.util.Scanner;

public class Client {

	private String name;
	private String cpf;
	private String telephone;
	
	Client(){}
	
	public Client(String name, String cpf, String telephone){
		this.name = name;
		this.cpf = cpf;
		this.telephone = telephone;
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
	
	public double getScore() {
		double score;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Dê uma nota para este veículo: ");
		do {
		      score = ler.nextDouble();
		      
		      if(score<0 || score>10) {
		    	  System.out.println("Nota invalida ");
		    	  System.out.println("Dê uma nota entre 0.00 e 10.00 ");
		      }
		      
		   }while(score<0 || score>10);
		
		ler.close();
		return score;
	}
	
	public void avaliaCarro(Automobile automobile, double score){
		
		System.out.println("Modelo: " + automobile.getModel());
		System.out.println("Ano:    " + automobile.getYear());
		score = this.getScore();
		System.out.println("\n\n------------------------------------");
		System.out.println(automobile.getModel());
		System.out.println(automobile.getYear());
		System.out.print("Sua avaliacao:  "+ score);
		 	
	}
}
