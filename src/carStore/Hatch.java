package carStore;

public class Hatch extends Automobile {

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

	
	private Hatch(){
		
	}
	
	public Hatch(int luggageSize, Category categoria){
	    this.luggageSize = luggageSize;
		this.categoria = categoria;
	}
}

