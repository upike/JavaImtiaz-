package car_dealershipimtiaz;

public class Customer {

	private String name;
	private String address;
	private double cashOnHand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		// address= address+" Dealership City";
		address += " Dealership City";
		this.address = address;
	}

	public double getCashOnHand() {

		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500; // we want to give every customer a bonus 500$
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handelCustomer(this, finance, vehicle);

	}

}
