package carStore;

public class Sedan extends Automobile {

	private int luggageSize;
	private Category categoria;
	
	
	
	public int getLuggageSize() {
		return luggageSize;
	}

	public void setLuggageSize(int luggageSize) {
		this.luggageSize = luggageSize;
	}

	public String getCategoria() {
		return categoria.getTypevehicle();
	}

	
	private Sedan(){
		
	}
	
	public Sedan(int luggageSize, Category categoria){
	    this.luggageSize = luggageSize;
		this.categoria = categoria;
	}
}
