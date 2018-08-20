import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


// Dont need this class!

public class Cars {
//	private Car currCar;
//	private Car [] cars;
	List<Object> carsList;
	Stream<Object> carsStream;
	
	/*
	 * @param we are creating a stream of cars
	 * */
	Cars(){
		
		carsStream.forEach(s -> System.out.println(s + " , "));
	}
	
	/*
	 * @param Will take the cars and put it in a list
	 * */
	public void setList(Car [] currCar) {
		//cars is the Car array List
		for(Car x : currCar)
			carsList.add(x);
		//carList is initialized with all car objects
		carsStream = carsList.stream();
	}
	
	public void setCarStream(Stream<Object> m) {
		carsStream = m;
	}
	
	public Stream<Object> getStream() {
		return carsStream;
	}


	public Car getCarAt(int x) {
		return (Car) carsList.get(x);
	}
	
}
