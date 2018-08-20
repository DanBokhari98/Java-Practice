package dogDoorProject;

public class dogDoor extends Remote{
	private final Dog onlyDog;
	private boolean lock = true;
	
	dogDoor(){
		super();
		onlyDog = new Dog("roof-roof", true);

		lock = true;
		if(lock == false) doorTimer();
		
	}
	
	
//	public void setLock(boolean lockStatus) {
//		lock = lockStatus;
//	}
	
	public boolean unlock(Dog d){
		if(isCorrect(pin) == true) {
			lock = false;
			System.out.println("The Dog door is open");
			return true;
		}
		else if(d.equals(onlyDog)){
			lock = false;
			System.out.println("The Dog door is open");
			return true;
		}
		lock = true;
		return false;
	}
	
	public void doorTimer() {
		final int MAX_SECONDS = 5;
		int seconds = 0;
		if(lock == false)
			while(seconds < MAX_SECONDS) {
				seconds += (int) System.currentTimeMillis() / 1000;
				System.out.println("Dog door will close in " + seconds  + " Seconds");
			}
		lock = true;
	}
	
}
