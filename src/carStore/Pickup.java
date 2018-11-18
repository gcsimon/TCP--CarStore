package carStore;

public class Pickup extends Automobile {
	
	private int carryingCapacity;

	
	public int getCarryingCapacity() {
		return carryingCapacity;
	}


	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}


	public Pickup(){
		
	}
	
     public Pickup(int year, long km, int weight, int hp,double value, double urbanConsumption, double roadConsumption, String licensePlate, int Tanksize, String model, String category, int carryingCapacity) {
		
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
		this.setCarryingCapacity(carryingCapacity);
     }
}
