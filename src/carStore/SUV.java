package carStore;

public class SUV extends Automobile {
	
	private int groundheight;
	private boolean fourByFour;
	


	public int getGroundheight() {
		return groundheight;
	}


	public void setGroundheight(int groundheight) {
		this.groundheight = groundheight;
	}


	public boolean isFourByFour() {
		return fourByFour;
	}


	public void setFourByFour(boolean fourByFour) {
		this.fourByFour = fourByFour;
	}

	
	public SUV(){
		
		
	}
	
     public SUV(int year, long km, int weight, int hp,double value, double urbanConsumption, double roadConsumption, String licensePlate, int Tanksize, String model, String category, int groundheight, boolean fourByFour) {
		
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
        this.setGroundheight(groundheight);
        this.setFourByFour(fourByFour);

     }


}
