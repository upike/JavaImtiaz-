package car_dealership;

public class Vehicle {

	private String make;
	private String model;
	private String color;
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
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
}
