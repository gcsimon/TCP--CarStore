package carStore;

public class Hatch extends Automobile {

	private int luggageSize;


	public int getLuggageSize() {
		return luggageSize;
	}

	public void setLuggageSize(int luggageSize) {
		this.luggageSize = luggageSize;
	}

	
	public Hatch(){
		
	}
	
public Hatch(int year, long km, int weight, int hp,double value, double urbanConsumption, double roadConsumption, String licensePlate, int Tanksize, String model, Category category, int luggageSize) {
		
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
		this.setLuggageSize(luggageSize);
}

}

