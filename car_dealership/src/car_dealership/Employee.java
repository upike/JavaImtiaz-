package car_dealership;

public class Employee {

	String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	double doubleAmount; 
 public void	handelCustomer(Customer cust, boolean finance, Vehicle vehicle){
	 if(finance==true)
		 runCreditHistory( cust, vehicle.getPrice()-cust.getCashOnHand());
	 else if (vehicle.getPrice() <= cust.getCashOnHand())
	 	prosessTransaction( cust, vehicle);
	 else
		 System.out.println("Bring more money!");
		 
		
	}
 public void runCreditHistory(Customer cust, double doubleAmount){
	 System.out.println("You do not have enough cash to buy this car but We can give you " + doubleAmount+ "$ amount of credit");
	 System.out.println("So congratulation here is your new car!");
	 
 }
 
 public void prosessTransaction(Customer cust, Vehicle vehicle) {
	 	System.out.println( cust.getName() + " Congratulation, Here is your new  "+vehicle.getColor()+ " "+ vehicle.getMake()+ " " + vehicle.getModel()+ " !");
 }
 

}


/**
 * handelCustomer(Customer cust, boolean finance, Vehicle vehicle)
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