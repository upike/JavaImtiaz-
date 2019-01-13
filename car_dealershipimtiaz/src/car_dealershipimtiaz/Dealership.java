package car_dealershipimtiaz;

public class Dealership {
	
	public static void main(String [] args) {
	
	Customer cust1 = new Customer();
	cust1.setName("Tom");
	cust1.setAddress("123 Anything St. ");
	cust1.setCashOnHand(25000);

	//Vehicle vehicle= new Vehicle("Honda", "Accord", 15000);
	Object vehicleObjecttest=new Vehicle("Ford", "Mustang",30000); // we can use Object instant variable because every class inheriting from Object class by default.
	
	Vehicle vehicle= new Vehicle("BMW", "M3", 20000);		
	
	Vehicle car = new Vehicle("BMW", "M3", 20000);// If I give the same exact data that's in here to this instance now the data that this variables pointing 

	boolean value= car.equals(vehicle);
	System.out.println(value);
	
	
	
	Employee emp = new Employee();

	cust1.purchaseCar(vehicle, emp, false);
		
	
	
	
	

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
	 */
	}
}
// encapsulation means hiding the data 



/*
 * All right so we covered a lot of ground in this lesson.So take your
 * time to internalize all of these details and I hope that you try to solve
 * this problem
 */
// to internalize przyswoiæ przyswajaæ internalizowaæ
//to intern {czas.}PL praktykowaæ 


