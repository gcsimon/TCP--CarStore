package carStore;

public class Eletric extends Automobile {

	private double chargingTime;
	private Category categoria;
	
	public double getChargingTime() {
		return chargingTime;
	}	
	
	private Eletric() {}

	public void setChargingTime(double chargingTime) {
		this.chargingTime = chargingTime;
	}

	public String getCategoria() {
		return categoria.getTypevehicle();
	}



	public Eletric(double chargingTime, Category categoria){
		
		this.chargingTime = chargingTime;
		this.categoria = categoria;
	}
	
}
