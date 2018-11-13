package carStore;

public class Category {
	
    private String typevehicle;


	public String getTypevehicle() {
		return typevehicle;
	}

	public void setTypevehicle(String typevehicle) {
		this.typevehicle = typevehicle;
	}
    
    private Category()
    {
    	
    	
    }
   public  Category(String typevehicle)
    {
    	this.typevehicle = typevehicle;
    	
    }

}
