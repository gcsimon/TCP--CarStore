package carStore;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author leand
 * Classe que representa a generalização de um automóvel
 * 
 *
 */
@XStreamAlias("automobile")
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
	private String category;
	
	/**
	 * @return the year of the car
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param new year
	 * car year change
	 */
	public void setYear(int year) {
		this.year = year;
	}
	public long getKm() {
		return km;
	}
	/**
	 * @param new km
	 * car Km change
	 */
	public void setKm(long km) {
		this.km = km;
	}
	public int getWeight() {
		return weight;
	}
	/**
	 * @param new Weight
	 * car Weight change
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHp() {
		return hp;
	}
	/**
	 * @param new Hp
	 * car HP change
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	public double getValue() {
		return value;
	}
	/**
	 * @param new value
	 * car value change
	 */
	public void setValue(double value) {
		this.value = value;
	}
	public double getUrbanConsuption() {
		return urbanConsuption;
	}
	/**
	 * @param new urbanConsuption
	 * car urban Consuption change
	 */
	public void setUrbanConsuption(double urbanConsuption) {
		this.urbanConsuption = urbanConsuption;
	}
	public double getRoadConsumption() {
		return roadConsumption;
	}
	/**
	 * @param new RoadConsuption
	 * car Road Consuption change
	 */
	public void setRoadConsumption(double roadConsumption) {
		this.roadConsumption = roadConsumption;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	/**
	 * @param new LicensePlate
	 * car LicensePlate change
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public int getTankSize() {
		return tankSize;
	}
	/**
	 * @param new TankSize
	 * car TankSize change
	 */
	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
	
	public void andarKm(int km) {
		this.km = this.km + km;
	}
	
	/**
	 * @return autonomia
	 * 
	 */
	public double autonomia() {
		return ((this.getUrbanConsuption() + this.getRoadConsumption() )/2) * this.getTankSize();
	}
	
	public double costSimulation(double fuelPrice, double dailyKm) {
		return ((dailyKm * fuelPrice)/ (this.getUrbanConsuption()));
	}
	public String getModel() {
		return model;
	}
	/**
	 * @param new Model
	 * car Model change
	 */
	public void setModel(String model) {
		this.model = model;
	}	
	public String getCategory() {
		return category;
	}
	/**
	 * @param new Category
	 * car category change
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * creates a new car
	 * @param year
	 * @param km
	 * @param weight
	 * @param hp
	 * @param  value
	 * @param urbanConsumption
	 * @param roadConsumption
	 * @param licensplate
	 * @param tankSize
	 * @param model
	 * @param category
	 * 
	 */
	public Automobile(int year, long km, int weight, int hp,double value, double urbanConsumption, double roadConsumption, String licensePlate, int Tanksize, String model, String category ) {
		
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
	
	public void info() {
		
		System.out.println("Modelo: " + this.getModel());
		System.out.println("Tipo de veiculo: " + this.getClass().getSimpleName());
		System.out.println("Categoria: " + this.getCategory());
		System.out.println("Preco: " + this.getValue());
		System.out.println("km: " + this.getKm());
		System.out.println("placa: " + this.getLicensePlate());
		System.out.println("--------------------------------");
		
		
		
	}

}
