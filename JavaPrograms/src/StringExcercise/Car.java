package StringExcercise;

class Engine
{
	
	private String model;
	
	public Engine(String model)
	{
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return " [model=" + model + "]";
	}
	
	
}
public final class Car {
	
	private final String carname ;
	private final Engine engine;

		

	public Car(String carname, String model) {
		this.carname = carname;
		this.engine=new Engine(model);
	}

   
    public String getCarname() {
		return carname;
	}


	public Engine getEngine() {
		return engine;
	}

     
	@Override
	public String toString() {
		return " [carname=" + carname + ", engine=" + engine + "]";
	}


	public static void main(String[] args) {
		Car car = new Car("Swift","VS4");
		System.out.println(car);
		
	}

}
