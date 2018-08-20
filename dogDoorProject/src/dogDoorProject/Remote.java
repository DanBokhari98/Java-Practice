package dogDoorProject;

public class Remote {
	protected String pin = "1234";
	
	Remote(){
		
	}
	
	
	public void changePin(String pin) {
		this.pin = pin;
	}
	
	public boolean isCorrect(String userPin) {
		if(userPin.equals(this.pin)) {
			return true;
		}
	
		return false;
	}
	
	public String getPin() {
		return this.pin;
	}
}
