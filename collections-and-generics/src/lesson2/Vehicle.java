package lesson2;

public class Vehicle {
	
	public Vehicle(String make, String model, int price, boolean fourWDrive) {
		super();
		this.make=make;
		this.model=model;
		this.price=price;
		this.fourWDdrive=fourWDrive;
	}
	
	String make;
	String model;
	int price;
	boolean fourWDdrive; 
	
	
	public void setMake(String make) {
		this.make=make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setModel (String model) {
		
		this.model=model;
	}
	
	public String getModel() {
		
		return model; 
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFourWDdrive() {
		return fourWDdrive;
	}

	public void setFourWDdrive(boolean fourWDdrive) {
		this.fourWDdrive = fourWDdrive;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWDdrive=" + fourWDdrive + "]";
	}
	
	

}
