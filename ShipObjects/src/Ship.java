package hw3;

public class Ship {
	
	protected String name;
	protected String age;
	
	Ship(String name, String age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name.concat(" "+age);
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
	
}
