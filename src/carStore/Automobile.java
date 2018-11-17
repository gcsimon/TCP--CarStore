package carStore;

public class Automobile {
	private int year;
	private long km;
	private int weight;
	private int hp;
	private double value;
	private double urbanConsuption;
	private double roadConsumption;
	private String licensePlate;
	private int tankSize;
	private String model;
	private Category category;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getKm() {
		return km;
	}
	public void setKm(long km) {
		this.km = km;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getUrbanConsuption() {
		return urbanConsuption;
	}
	public void setUrbanConsuption(double urbanConsuption) {
		this.urbanConsuption = urbanConsuption;
	}
	public double getRoadConsumption() {
		return roadConsumption;
	}
	public void setRoadConsumption(double roadConsumption) {
		this.roadConsumption = roadConsumption;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public int getTankSize() {
		return tankSize;
	}
	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
	
	public void andarKm(int km) {
		this.km = this.km + km;
	}
	
	public double autonomia() {
		return ((this.getUrbanConsuption() + this.getRoadConsumption() )/2) * this.getTankSize();
	}
	
	public double costSimulation(double fuelPrice, double dailyKm) {
		return ((dailyKm * fuelPrice)/ (this.getUrbanConsuption()));
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}	
	public Automobile(int year, long km, int weight, int hp,double value, double urbanConsumption, double roadConsumption, String licensePlate, int Tanksize, String model, Category category ) {
		
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
	}	
	public Automobile() {
		
	}

}
