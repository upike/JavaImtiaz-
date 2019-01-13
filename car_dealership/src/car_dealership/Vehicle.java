package car_dealership;

public class Vehicle {

	public Vehicle(String make, String model, double price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	
	private String make;
	
	private String model;
	private double price;
	
	public void setMake(String make) {
		this.make=make;
	}
	public String getMake()
	{
		return make;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
}
