package dogDoorProject;

public class Dog {
	private String bark;
	private boolean isOwned;
	public boolean inDoors = true;
	
	Dog(String bark, boolean isMine){
		this.bark = bark;
		isOwned = isMine;
	}
	
	public String getBark() {
		return bark;
	}
	
	public void setBark(String bark){
		this.bark = bark;
	}
	
	public boolean verifyOwned(boolean isOwned) {
		if(isOwned == true) return true;	
		return false;
	}

}
