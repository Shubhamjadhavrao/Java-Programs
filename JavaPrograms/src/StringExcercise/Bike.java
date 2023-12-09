package StringExcercise;
class Engine1{
	private float capacity;
	private String name;
	
	public Engine1(float capacity,String name) {
		this.capacity=capacity;
		this.name=name;
	}

	public float getCapacity() {
		return capacity;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Engine1 [capacity=" + capacity + ", name=" + name + "]";
	}
	
}
public final class Bike {
	private final int model;
	private final String companyName;

	public Bike(int model,String companyName) {
		this.model=model;
		this.companyName=companyName;

	}

	public int getModel() {
		return model;
	}

	public String getCompanyName() {
		return companyName;
	}


	
	@Override
	public String toString() {
		return "Bike [model=" + model + ", companyName=" + companyName + "]";
	}
	
	public static void main(String[] args) {
		Bike bike = new Bike(23, "YAMAHA");
		System.out.println(bike);
		Engine1 engine = new Engine1(28, "KTM");
		System.out.println(engine);
		
	}

	
}
	