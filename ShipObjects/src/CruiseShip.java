package hw3;

public class CruiseShip extends Ship{

	private Integer max = 0;
	CruiseShip(String name, String age) {
		super(name, age);
	}
	
	@Override
	public String toString() {
		String s = this.getName();
		return s.concat(" " + Integer.toString(max) + " passengers allowed");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setMax(int max){
		this.max = max;
	}
	
}

