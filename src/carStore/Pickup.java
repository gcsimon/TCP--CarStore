package carStore;

public class Pickup extends Automobile {
	
	private int carryingCapacity;
	private Category categoria;
	
	

	public int getCarryingCapacity() {
		return carryingCapacity;
	}


	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}


	public String getCategoria() {
		return categoria.getTypevehicle();
	}

	
	private Pickup(){
		
	}
	
	public Pickup(int carryingCapacity, Category categoria){
	    this.carryingCapacity = carryingCapacity;
		this.categoria = categoria;

    }
}
