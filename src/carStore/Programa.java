package carStore;

public class Programa {

	public static void main(String[] args) {
		System.out.println("automovel");
		
		Veiculo Bau = new TruckBau();
		Veiculo Frigorifico = new TruckFrigorifico();
		Veiculo Tanque = new TruckTanque();
		Veiculo Sport = new MotorcycleSport();
		Veiculo Custom = new MotorcycleCustom();
		Veiculo Street = new MotorcycleStreet();
		Veiculo Hatch = new CarHatch();
		Veiculo PickUp = new CarPickUp();
		Veiculo Sedan = new CarSedan();
		Veiculo SUV = new CarSUV();

		
		System.out.println(Bau.nome); 
		System.out.println( Frigorifico.nome); 
		System.out.println( Tanque.nome); 
	    System.out.println( Sport.nome); 
		System.out.println( Custom.nome);  
		System.out.println( Street.nome);  
		System.out.println(  Hatch.nome);  
        System.out.println( PickUp.nome);  
	    System.out.println( Sedan.nome); 
		System.out.println( SUV.nome); 
	}
}


