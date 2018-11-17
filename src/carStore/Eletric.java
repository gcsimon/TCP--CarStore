package carStore;

public class Eletric extends Automobile {

	private double chargingTime;

	public double getChargingTime() {
		return chargingTime;
	}	
	
    public void setChargingTime(double chargingTime) {
		this.chargingTime = chargingTime;
    }
    
	public Eletric() {
		
	}
	
    public Eletric(int year, long km, int weight, int hp,double value, double urbanConsumption, double roadConsumption, String licensePlate, int Tanksize, String model, Category category, double chargingTime) {
		
		this.setYear(year);
		this.setKm(km);
		this.setWeight(weight);
		this.setHp(hp);
		this.setValue(value);
		this.setUrbanConsuption(urbanConsumption);
		this.setRoadConsumption(roadConsumption);
		this.setLicensePlate(licensePlate);
		this.setTankSize(Tanksize);		
		this.setModel(model);
		this.setCategory(category);
		this.setChargingTime(chargingTime);
	}	
	
}


