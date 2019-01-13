package car_dealership_my_practice;

public class Dealership {
	public static void main(String []arg) {
		
		Customer customer= new Customer("Mary", "femail", 22);
		customer.introduceYourself(customer);
		customer.askForOffert();
		Customer customer2=new Customer("Billy", "male",20);
		customer2.interestedIn(customer2);
	}


}
