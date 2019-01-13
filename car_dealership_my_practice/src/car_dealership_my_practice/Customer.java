package car_dealership_my_practice;


public class Customer {
	String name;
	String gender;
	int age; 
	
	
	public Customer(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public  void interestedIn(Customer customer) {
		
		if(customer.age<21 && customer.gender.equals("male")) {
			System.out.println("I am interested in sports cars");
		}
		else if (customer.gender.equals("femail")) {
			System.out.println("I am interested in Familly car");
		}
		else
			System.out.println("I am interested in Transport cars");
		
		
	}
	public void askForOffert() {
		
		System.out.println("Please, Show me your offer...");
		
		
	}
	public void introduceYourself(Customer customer) {
		
		System.out.println("Hello I am "+ customer.name);
		
	}
	

}
