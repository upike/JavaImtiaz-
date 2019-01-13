package car_dealershipimtiaz;

public class Employee {


	public void handelCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (finance == true) { 
			double loanAmount=vehicle.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		} else if (vehicle.getPrice()<=cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
			
		} else {
			System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
		}


	}
	
	public void runCreditHistory(Customer cust , Double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " 
				+ vehicle + " for the price " +vehicle.getPrice());
		
	}
}

/**
 * handelCustomer(Customer cust, boolean finance, Vehicle vehicle)
 * 
 * if (finance ==true) runCreditHistory(Customer cust, double doubleAmount) //
 * doubleAmount= difference between the vehicle pric and the cashOnHand if else
 * (vehicle.getPrice() <= cust.getcashOnHand) processTransaction(Customer cust,
 * Vehicle vehicle) // you can just return that the customer has purchased the
 * vehicle
 * 
 * else tell customer to bring more money
 */