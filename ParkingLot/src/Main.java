import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
	public static void main(String [] args) {
		ParkingLot lot = new ParkingLot();
		Car [] cars = new Car[30];
		List<Object> carList = null;
		int count = 0;
		List<String> lotPark;
		try {
			int counter=0;
			for(Car x : cars) {
				x = new Car();
				x.setModel("Car" + ++count);
				lot.park(x, counter++);
//				lotpark = pipeline.stream.filter().(x -> cars);
			}
			
			
			Stream<Object> parkingCount =  carList.stream().limit(10);
			System.out.println(parkingCount);
			
			
			
		} catch (Exception e) {
			
			//System.out.println(lot);
			System.out.println("\nFULL LOT");
		}
		
		try {
			//Removing objects
			lot.remove(17);
			lot.remove(22);
			lot.remove(21);
			lot.remove(17);
			System.out.println("\n\n"+lot);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Car lambo = new Car();
		lambo.setModel("Lamborghini");
		try {
			lot.park(lambo, 17);
			System.out.println(lot.getCar(17).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
