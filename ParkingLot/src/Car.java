
public class Car {
	
	private String licensePlate;
	private String color;
	private String model;
	
	Car(){
		color=null;
		licensePlate = null;
		model=null;
	}
	/*
	 * @Param Creating the car object with all its properties
	 * */
	Car(String licensePlate, String color, String model){
		this.licensePlate = licensePlate;
		this.color = color;
		this.model = model;
	}
	
	public void setPlate(String license) {
		licensePlate = license;
	}
	
	public void setColor(String col) {
		this.color = col;
	}
	
	public void setModel(String mod) {
		model = mod;
	}
	
	public String getModel() {return model;}
	
	
	
}
