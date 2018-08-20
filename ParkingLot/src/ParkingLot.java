import java.util.HashMap;

public class ParkingLot {

	private HashMap<Integer, Car []> carsInLot;
	private int size;
	
	ParkingLot(){
		carsInLot = new HashMap<Integer,Car []>();
		carsInLot.put(0, new Car[8]);
		carsInLot.put(1, new Car[8]);
		carsInLot.put(2, new Car[8]);
		size = 0;
	}
	

	public void park(Car car, int pos) throws Exception{
		if(pos < 0 && pos >24) throw new Exception("Not a valid position");
		if(size == 24)throw new Exception("Parking lot is full");
		int parkingPosition = pos % 8;
		int key = pos/8;
		carsInLot.get(key)[parkingPosition] = car;
		++size;
	}
	
	public Car getCar(int pos) throws Exception {
		if(pos < 0 && pos >24) throw new Exception("Not a valid position");
		int parkingPosition = pos % 8;
		int key = pos/8;
		return carsInLot.get(key)[parkingPosition];
	}
	
	public void remove(int pos) throws Exception{
		if(pos < 0 && pos > 24) throw new Exception("Not Valid Position");
		int parkingPosition = pos % 8;
		int key = pos/8;
		carsInLot.get(key)[parkingPosition] = null;
		--size;
	}
	
	public String toString() {
		String lot = "";
		for(int i=0;i<=2;++i) {
			for(int j=0;j<=7;++j) {
				try {
					lot+= "[" +carsInLot.get(i)[j].getModel() + "] ";
				}catch(NullPointerException e) {
					lot+= "[OPEN] " ;
				}
			}
		}
		return lot;
	}
}
