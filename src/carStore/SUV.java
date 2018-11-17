package carStore;

public class SUV extends Automobile {
	
	private int groundheight;
	private boolean fourByFour;
	private Category categoria;
	
	
	private SUV(){
		
		
	}
	
	public SUV(int groundheight, boolean fourByFour, Category categoria ) {

		this.groundheight = groundheight;
		this.fourByFour = fourByFour;
		this.categoria = categoria;
	}


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


	public String getCategoria() {
		return categoria.getTypevehicle();
	}


	
	

}
