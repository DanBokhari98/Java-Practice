package hw3;

public class CargoShip extends Ship{
	
	private int capacity = 0;
	
	CargoShip(String name, String age){
		super(name, age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setCapactiy(int cap) {
		capacity = cap;
	}
	
	public int getCapactiy() {
		return capacity; 
	}
	
	@Override
	public String toString(){
		String toString = name.concat(" " + capacity);
		return toString;
	}
	
	

}
