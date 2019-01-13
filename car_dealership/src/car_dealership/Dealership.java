package car_dealership;

public class Dealership {
	
	public static void main(String [] args) {
	Customer cust1 = new Customer();

	cust1.setName("Tom");
	cust1.setAddress("123 Anything St. ");
	cust1.setCashOnHand(60200);
	cust1.setIsWantCredit(false);
	Vehicle vehicle= new Vehicle();
	vehicle.setMake("Ford");
	vehicle.setColor("red");
	vehicle.setModel("Mustang");
	vehicle.setPrice(50000);
	Employee emp = new Employee();
	cust1.introduceYourself(cust1);
	
	cust1.purchaseCar(vehicle, emp, cust1.getIsWantCredit());
	
		
	emp.handelCustomer(cust1, cust1.getIsWantCredit(), vehicle);
	
	
	

	/**
	 * handelCustomer(Customer cust, boolean finance, Vehicle vehicle)   // in employee class
	 * 
	 * if (finance ==true)
	 * 		runCreditHistory(Customer cust, double doubleAmount) // doubleAmount= difference between the vehicle pric and the cashOnHand 
	 * if else (vehicle.getPrice() <= cust.getcashOnHand)
	 * 		processTransaction(Customer cust, Vehicle vehicle)
	 *  // you can just return that the customer has purchased the vehicle
	 * 
	 * else 
	 *      tell customer to bring more money 
	 * 
	 * @param vehicle
	 * @param emp
	 * @param finance

	 *
	 *
	 */
	}
}
// encapsulation means hiding the data 